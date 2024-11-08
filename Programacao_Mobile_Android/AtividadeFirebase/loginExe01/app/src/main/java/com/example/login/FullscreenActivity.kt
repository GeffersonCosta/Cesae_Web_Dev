package com.example.login

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
import com.example.login.adapter.ListaTarefaAdapter
import com.example.login.data.ListaTarefaMock
import com.example.login.databinding.ActivityFullscreenBinding
import com.example.login.model.ListaTarefa
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
class FullscreenActivity : AppCompatActivity() {
    var cont = 0
    var novaTarefa = "";
    var numeroRemoverTarefa = 0;

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
        super.onCreate(savedInstanceState)
        val i = intent
        var emailUser = i.extras?.getString("email")

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


        binding.imageViewButtonAdicionarTarefa.setOnClickListener{
            novaTarefa = binding.editTextNovaTarefa.text.toString();
            if(novaTarefa.isEmpty()){
                Toast.makeText(this, "Informe a tarefa", Toast.LENGTH_LONG).show()
            }else{
                cont++
                mock.listaTarefaMock.add(ListaTarefa(cont, novaTarefa))
                binding.recyclerviewListaTarefa.layoutManager = LinearLayoutManager(this)
                binding.recyclerviewListaTarefa.adapter = ListaTarefaAdapter(mock.listaTarefaMock)
                gravarTarefaDB(emailUser.toString())
            }
        }
        binding.imageViewButtonRemoverTarefa.setOnClickListener{
            numeroRemoverTarefa = binding.editTextNumeroRemoverTarefa.text.toString().toInt()

        }
    }
    private fun gravarTarefaDB(emailUser: String){

        val dados = mapOf(
            "idTarefa" to cont,
            "tarefa" to novaTarefa,
        )
        db.collection("Usuario").document(emailUser).collection("ListaTarefas").add(dados)
    }
}


