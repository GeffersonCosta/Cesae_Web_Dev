package com.example.Login

import android.annotation.SuppressLint
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.BatteryManager
import android.os.Build
import android.os.Bundle
import android.view.WindowInsets
import android.view.WindowManager
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.Login.adapter.ListaTarefaAdapter
import com.example.Login.data.ListaTarefaMock
import com.example.Login.model.ListaTarefa
import com.example.login.R
import com.example.login.databinding.ActivityFullscreenBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
class FullscreenActivity : AppCompatActivity() {
    var cont = 0
    var novaTarefa = "";

    var flag = false;



    private val binding by lazy {
        ActivityFullscreenBinding.inflate(layoutInflater)
    }

   private var mock = ListaTarefaMock()

    private val auth by lazy{
        FirebaseAuth.getInstance()
    }
    private val db by lazy{
        FirebaseFirestore.getInstance()
    }

   /*private lateinit var binding: ActivityFullscreenBinding*/

    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        var numeroRemoverTarefa = ""
        var id = auth.currentUser?.uid
        var tarefa = db.collection("Usuario").document(id.toString()).collection("ListaTarefas")
        super.onCreate(savedInstanceState)
        loadData()


        /*binding = ActivityFullscreenBinding.inflate(layoutInflater)*/

        setContentView(binding.root)
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.R){
            window.insetsController?.hide(WindowInsets.Type.statusBars())
        }else{
            window.addFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN
            )
        }

        val bateriaReceiver: BroadcastReceiver = object : BroadcastReceiver(){

            override fun onReceive(context: Context?, intent: Intent?) {
               if(intent != null){
                   val nivel: Int = intent.getIntExtra(BatteryManager.EXTRA_LEVEL, 0)
                   if(nivel == 100){
                       binding.imageView.setImageResource(R.drawable.bateria7_foreground)
                   }
                   if(nivel == 80){
                       binding.imageView.setImageResource(R.drawable.bateria6_foreground)
                   }
                   if(nivel == 60){
                       binding.imageView.setImageResource(R.drawable.bateria5_foreground)
                   }
                   if(nivel == 40){
                       binding.imageView.setImageResource(R.drawable.bateria4_foreground)
                   }
                   if(nivel == 20){
                       binding.imageView.setImageResource(R.drawable.bateria3_foreground)
                   }
                   if(nivel == 10){
                       binding.imageView.setImageResource(R.drawable.bateria2_foreground)
                   }
                   if(nivel == 5){
                       binding.imageView.setImageResource(R.drawable.bateria1_foreground)
                   }
                   if(nivel == 0){
                       binding.imageView.setImageResource(R.drawable.bateria0_foreground)
                   }

               }
            }
        }
        registerReceiver(bateriaReceiver, IntentFilter(Intent.ACTION_BATTERY_CHANGED))

        var rotacao = 460f
        binding.layoutMenu.animate().translationY(rotacao)
        binding.imageViewColapsadoButton.setOnClickListener{
            if(rotacao == 460f){
                binding.layoutMenu.animate().translationY(0F).setDuration(
                    resources.getInteger(android.R.integer.config_longAnimTime).toLong()
                )
                binding.imageViewColapsadoButton.setImageResource(R.drawable.colapsdown_foreground)
                rotacao = 0f
            }else{
                binding.layoutMenu.animate().translationY(460F).setDuration(
                    resources.getInteger(android.R.integer.config_longAnimTime).toLong()
                )
                binding.imageViewColapsadoButton.setImageResource(R.drawable.colaps_foreground)
                rotacao = 460f

            }


        }

        binding.buttonCor1.setOnClickListener{
            binding.layoutMenu.setBackgroundColor(getColor(R.color.cor1))
            binding.buttonCor1.setBackgroundColor(getColor(R.color.cor1variacao))
        }
        binding.buttonCor2.setOnClickListener{
            binding.layoutMenu.setBackgroundColor(getColor(R.color.cor2))
            binding.buttonCor2.setBackgroundColor(getColor(R.color.cor2variacao))
        }
        binding.buttonCor3.setOnClickListener{
            binding.layoutMenu.setBackgroundColor(getColor(R.color.cor3))
            binding.buttonCor3.setBackgroundColor(getColor(R.color.cor3variacao))
        }








        binding.imageViewButtonAdicionarTarefa.setOnClickListener{
            novaTarefa = binding.editTextNovaTarefa.text.toString();
            binding.editTextNovaTarefa.text.clear()
            tarefa.get().addOnSuccessListener { querySnapshot ->
                if(novaTarefa.isEmpty()){
                    Toast.makeText(this, "Informe a tarefa", Toast.LENGTH_LONG).show()
                }else{
                    if(querySnapshot.isEmpty){
                        cont = 0
                    }
                    cont = querySnapshot.size() + 1
                    mock.listaTarefaMock.add(ListaTarefa(cont, novaTarefa))
                    binding.recyclerviewListaTarefa.layoutManager = LinearLayoutManager(this)
                    binding.recyclerviewListaTarefa.adapter = ListaTarefaAdapter(mock.listaTarefaMock)
                    gravarTarefaDB()
                }
            }
        }
        binding.imageViewButtonRemoverTarefa.setOnClickListener{
            numeroRemoverTarefa = binding.editTextNumeroRemoverTarefa.text.toString()
            binding.editTextNumeroRemoverTarefa.text.clear()
           var tarefa = db.collection("Usuario").document(id.toString()).collection("ListaTarefas")
            if(numeroRemoverTarefa.isNotEmpty()){
                var nrNumeroRmoverTarefa:Int = numeroRemoverTarefa.toInt()
                tarefa.whereEqualTo("idTarefa", nrNumeroRmoverTarefa).get().addOnSuccessListener {querySnapshot ->
                    for(tarefaId in querySnapshot){
                        var idTarefa = tarefaId.data?.get("idTarefa").toString().toInt()
                        if(idTarefa == nrNumeroRmoverTarefa){
                            tarefa.document(tarefaId.id).delete()
                            updateId()
                            var indexParaRemover = mock.listaTarefaMock.indexOfFirst { it.idTarefa == nrNumeroRmoverTarefa}
                            mock.listaTarefaMock.removeAt(indexParaRemover)
                            binding.recyclerviewListaTarefa.adapter?.notifyItemRemoved(indexParaRemover)
                            flag = true

                        }

                    }
                    if(flag){
                        limparLista()
                        flag = false
                    }
                }
            }else{
                if(numeroRemoverTarefa.isEmpty()){
                    Toast.makeText(this, "Insira um número", Toast.LENGTH_LONG).show()
                }else{
                    Toast.makeText(this, "Lista Vazia", Toast.LENGTH_LONG).show()
                }
            }














        }

    }
    private fun limparLista(){
        var id = auth.currentUser?.uid
        var index = 0
        val tarefas = db.collection("Usuario").document(id.toString()).collection("ListaTarefas")
        tarefas.get().addOnSuccessListener {   querySnapshot ->
            index = querySnapshot.size()-1
            for(tarefasColecao in querySnapshot){
               if(tarefasColecao.data.isNotEmpty())
                mock.listaTarefaMock.removeAt(index)
                binding.recyclerviewListaTarefa.adapter?.notifyItemRemoved(index)
                index--
                if(mock.listaTarefaMock.isEmpty()){
                    updateLista()
                }

            }

        }
    }
    private fun gravarTarefaDB(){
       var id = auth.currentUser?.uid
        val dados = mapOf(
            "idTarefa" to cont,
            "tarefa" to novaTarefa,
        )
        db.collection("Usuario").document(id.toString()).collection("ListaTarefas").add(dados)
    }

    private fun updateLista(){
        var id = auth.currentUser?.uid
        val tarefaColecao = db.collection("Usuario").document(id.toString()).collection("ListaTarefas")
        tarefaColecao.get().addOnSuccessListener {querySnapshot ->
            for (conteudo in querySnapshot){
                var idTarefa = conteudo.data.get("idTarefa").toString().toInt()
                var tarefa = conteudo.data.get("tarefa").toString()
                mock.listaTarefaMock.add(ListaTarefa(idTarefa,tarefa))
                binding.recyclerviewListaTarefa.layoutManager = LinearLayoutManager(this)
                binding.recyclerviewListaTarefa.adapter = ListaTarefaAdapter(mock.listaTarefaMock)
            }

        }

    }







    private fun loadData(){
        var id = auth.currentUser?.uid
        val tarefas = db.collection("Usuario").document(id.toString()).collection("ListaTarefas")

        tarefas.orderBy("idTarefa").get().addOnSuccessListener {  querySnapshot ->
            if(querySnapshot != null){
                for(tarefaColecao in querySnapshot){
                   var idTarefa = tarefaColecao.data?.get("idTarefa").toString().toInt()
                    var tarefaDescricao = tarefaColecao.data?.get("tarefa").toString()
                    mock.listaTarefaMock.add(ListaTarefa(idTarefa,tarefaDescricao))
                    binding.recyclerviewListaTarefa.layoutManager = LinearLayoutManager(this)
                    binding.recyclerviewListaTarefa.adapter = ListaTarefaAdapter(mock.listaTarefaMock)
                }

            }else{
                Toast.makeText(this, "ERRO: deu vazio", Toast.LENGTH_LONG).show()
            }

        }
    }
    private fun updateId(){
        var id = auth.currentUser?.uid
        val tarefas = db.collection("Usuario").document(id.toString()).collection("ListaTarefas")
        var cont = 1
        tarefas.get().addOnSuccessListener {querySnapshot ->
            for (documentSnapshot in querySnapshot) {
                var updateIdProduto =  tarefas.document(documentSnapshot.id)
                updateIdProduto.update("idTarefa", cont)
                cont++

            }


        }
    }





}




