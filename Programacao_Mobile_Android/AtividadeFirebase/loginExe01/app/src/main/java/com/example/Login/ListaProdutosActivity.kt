package com.example.Login

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.Login.adapter.ListaProdutoAdapter
import com.example.Login.data.ListaProdutoMock
import com.example.Login.model.Produto
import com.example.login.databinding.ActivityListaProdutosBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore

class ListaProdutosActivity : AppCompatActivity() {
    var nome = "";
    var idProduto = 0;
    var cont = 0;
    val mock = ListaProdutoMock()
    var flag = false


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
        //val i = intent
       // var emailUser = i.extras?.getString("email")

        loadData()



        binding.imageViewAdicionarProduto.setOnClickListener{
            nome = binding.editNomeProduto.text.toString()
            if(nome.isEmpty()){
                Toast.makeText(this, "Informe o nome do produto", Toast.LENGTH_LONG).show()
            }
            else{
                val produtos = db.collection("Usuario").document(id.toString()).collection("produtos").orderBy("idProduto")

                produtos.get().addOnSuccessListener {   querySnapshot ->
                    if(querySnapshot.isEmpty){
                     cont = 0
                    }
                    cont = querySnapshot.size() + 1
                    mock.listaProdutoMock.add(Produto(cont,nome))
                    binding.recyclerviewLista.layoutManager = LinearLayoutManager(this)
                    binding.recyclerviewLista.adapter = ListaProdutoAdapter(mock.listaProdutoMock)
                    binding.editNomeProduto.text.clear()
                    binding.editNomeProduto.focusable
                    gravarUtilizadorDB()
                }

            }
        }



        binding.imageRemoverProduto.setOnClickListener{

            var userNumeroProduto = binding.editRemoverProduto.text.toString()
            binding.editRemoverProduto.text.clear()
            val produtos = db.collection("Usuario").document(id.toString()).collection("produtos")
            produtos.get().addOnSuccessListener {QuerySnapshot ->
                if(userNumeroProduto.isNotEmpty() && !QuerySnapshot.isEmpty){
                    var nProduto:Int = userNumeroProduto.toInt()
                    produtos.whereEqualTo("idProduto", nProduto)
                        .get()
                        .addOnSuccessListener { querySnapshot ->
                            for (documentSnapshot in querySnapshot) {
                                idProduto = documentSnapshot.data?.get("idProduto").toString().toInt()
                                if(idProduto == nProduto){
                                    produtos.document(documentSnapshot.id).delete()
                                    updateId()
                                    var indexParaRemover = mock.listaProdutoMock.indexOfFirst { it.idProduto == nProduto}
                                    mock.listaProdutoMock.removeAt(indexParaRemover)
                                    binding.recyclerviewLista.adapter?.notifyItemRemoved(indexParaRemover)
                                    flag = true
                                }
                            }
                            if(flag){
                                limparLista()
                                flag = false
                            }

                        }

                }else{
                    if(QuerySnapshot.isEmpty){
                        Toast.makeText(this, "Lista Vazia", Toast.LENGTH_LONG).show()
                    }else{
                        Toast.makeText(this, "Insira um número", Toast.LENGTH_LONG).show()
                    }

                }

            }



        }

    }



        private fun limparLista(){
            var index = 0
            val produtos = db.collection("Usuario").document(id.toString()).collection("produtos")
            produtos.get().addOnSuccessListener {   querySnapshot ->
                index = querySnapshot.size()-1
                for(produto in querySnapshot){
                    if(produto.data.isNotEmpty()){
                        mock.listaProdutoMock.removeAt(index)
                        binding.recyclerviewLista.adapter?.notifyItemRemoved(index)
                        index--
                        if(mock.listaProdutoMock.isEmpty()){
                            updateLista()
                        }
                    }
                }

            }
        }


    private fun updateLista(){
            val produtos = db.collection("Usuario").document(id.toString()).collection("produtos")
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


    private fun updateId(){
        val produtos = db.collection("Usuario").document(id.toString()).collection("produtos")

        var cont = 1
        produtos.get().addOnSuccessListener {querySnapshot ->
            for (documentSnapshot in querySnapshot) {
                    var updateIdProduto =  produtos.document(documentSnapshot.id)
                    updateIdProduto.update("idProduto", cont)
                cont++

            }


        }
}

    private fun gravarUtilizadorDB(){

        val dados = mapOf(
            "idProduto" to cont,
            "nome" to nome,
        )
        db.collection("Usuario").document(id.toString()).collection("produtos").add(dados)
    }




    private fun loadData(){

        val produtos = db.collection("Usuario").document(id.toString()).collection("produtos")

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
