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
                            updateId(emailUser.toString())
                            var indexParaRemover = mock.listaProdutoMock.indexOfFirst { it.idProduto == nProduto}
                            mock.listaProdutoMock.removeAt(indexParaRemover)
                            binding.recyclerviewLista.adapter?.notifyItemRemoved(indexParaRemover)

                        }
                        limparLista(emailUser.toString())
                    }

            }

            else{
                Toast.makeText(this, "Insira um número", Toast.LENGTH_LONG).show()
            }


        }

    }



        private fun limparLista(emailUser: String){
            var index = 0
            val produtos = db.collection("Usuario").document(emailUser.toString()).collection("produtos")
            produtos.get().addOnSuccessListener {   querySnapshot ->
                index = querySnapshot.size()-1
                for(produto in querySnapshot){
                    if(produto.data.isNotEmpty()){
                        Toast.makeText(this, index.toString(), Toast.LENGTH_LONG).show()
                        mock.listaProdutoMock.removeAt(index)
                        binding.recyclerviewLista.adapter?.notifyItemRemoved(index)
                        index--
                        if(index == 0){
                            updateLista(true, emailUser)
                        }
                    }
                }

            }
        }


    private fun updateLista(boolean: Boolean, emailUser: String){
        if(boolean){
            val produtos = db.collection("Usuario").document(emailUser).collection("produtos")
            produtos.get().addOnSuccessListener {querySnapshot ->
                for (produto in querySnapshot){
                    var idProdutoDatabase = produto.data.get("idProduto").toString().toInt()
                    var nome = produto.data.get("nome").toString()
                    mock.listaProdutoMock.add(Produto(idProdutoDatabase,nome))
                    binding.recyclerviewLista.layoutManager = LinearLayoutManager(this)
                    binding.recyclerviewLista.adapter = ListaProdutoAdapter(mock.listaProdutoMock)
                }

            }

        }
    }


    private fun updateId(emailUser: String){
        val produtos = db.collection("Usuario").document(emailUser).collection("produtos")

        var cont = 1
        produtos.get().addOnSuccessListener {querySnapshot ->
            for (documentSnapshot in querySnapshot) {
                    var updateIdProduto =  produtos.document(documentSnapshot.id)
                    updateIdProduto.update("idProduto", cont)
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
