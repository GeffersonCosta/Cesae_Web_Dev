package com.example.login

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.login.adapter.ListaProdutoAdapter
import com.example.login.data.ListaProdutoMock
import com.example.login.databinding.ActivityListaProdutosBinding
import com.example.login.model.Produto
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FieldValue
import com.google.firebase.firestore.FirebaseFirestore

class ListaProdutosActivity : AppCompatActivity() {
    var nome = "";
    var idProduto = 0;
    var cont = 0;
    val mock = ListaProdutoMock()

    private val binding by lazy {
        ActivityListaProdutosBinding.inflate(layoutInflater)
    }
    private val auth by lazy{
        FirebaseAuth.getInstance()
    }
    val id = auth.currentUser?.uid
    private val db by lazy{
        FirebaseFirestore.getInstance()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val i = intent
        var emailUser = i.extras?.getString("email")

        loadData(emailUser.toString())



        binding.imageViewAdicionarProduto.setOnClickListener{
            nome = binding.editNomeProduto.text.toString()
            if(nome.isEmpty()){
                Toast.makeText(this, "Informe o nome do produto", Toast.LENGTH_LONG).show()
            }
            else{
                val produtos = db.collection("Usuario").document(emailUser.toString()).collection("produtos").orderBy("idProduto")
                produtos.get().addOnSuccessListener {   querySnapshot ->
                    if(querySnapshot.isEmpty){
                     cont = 0
                    }
                    cont = querySnapshot.size() + 1
                    mock.listaProdutoMock.add(Produto(cont,nome))
                    binding.recyclerviewLista.layoutManager = LinearLayoutManager(this)
                    binding.recyclerviewLista.adapter = ListaProdutoAdapter(mock.listaProdutoMock)
                    gravarUtilizadorDB(emailUser.toString())
                }

            }
        }



        binding.imageRemoverProduto.setOnClickListener{

            var userNumeroProduto = binding.editRemoverProduto.text.toString()
            val produtos = db.collection("Usuario").document(emailUser.toString()).collection("produtos")
            if(userNumeroProduto.isNotEmpty()){
               var nProduto:Int = userNumeroProduto.toInt()
                produtos.whereEqualTo("idProduto", nProduto)
                    .get()
                    .addOnSuccessListener { querySnapshot ->
                        for (documentSnapshot in querySnapshot) {
                            idProduto = documentSnapshot.data?.get("idProduto").toString().toInt()
                            produtos.document(documentSnapshot.id).delete()
                            updateId(nProduto, emailUser.toString())
                            var indexParaRemover = mock.listaProdutoMock.indexOfFirst { it.idProduto == nProduto}
                            mock.listaProdutoMock.removeAt(indexParaRemover)
                            binding.recyclerviewLista.adapter?.notifyItemRemoved(indexParaRemover)


                        }
                    }

            }else{
                Toast.makeText(this, "Insira um número", Toast.LENGTH_LONG).show()
            }


        }







    }


private fun updateId(userNumeroProduto:Int, emailUser: String){
    val produtos = db.collection("Usuario").document(emailUser).collection("produtos")

    var cont = 0
    produtos.get().addOnSuccessListener {querySnapshot ->
            for (documentSnapshot in querySnapshot) {
                    var updateIdProduto =  produtos.document(documentSnapshot.id)
                    updateIdProduto.update("idProduto", 0)
                    updateIdProduto.update("idProduto", FieldValue.increment(1+cont.toDouble()))
                cont++

            }
        }






}

    private fun gravarUtilizadorDB(emailUser: String){

        val dados = mapOf(
            "idProduto" to cont,
            "nome" to nome,
        )
        db.collection("Usuario").document(emailUser).collection("produtos").add(dados)
    }




    private fun loadData(emailUser: String){

      val produtos = db.collection("Usuario").document(emailUser).collection("produtos")

      produtos.orderBy("idProduto").get().addOnSuccessListener {  querySnapshot ->
          if(querySnapshot != null){
              for(produto in querySnapshot){
                  idProduto = produto.data?.get("idProduto").toString().toInt()
                  nome = produto.data?.get("nome").toString()
                  mock.listaProdutoMock.add(Produto(idProduto,nome))
                  binding.recyclerviewLista.layoutManager = LinearLayoutManager(this)
                  binding.recyclerviewLista.adapter = ListaProdutoAdapter(mock.listaProdutoMock)
              }

          }else{
              Toast.makeText(this, "ERRO: deu vazio", Toast.LENGTH_LONG).show()
          }

        }
    }






}
