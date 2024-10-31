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
    var peso = 0.0
    var valor = 0.0
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



        binding.buttonAdicionarProduto.setOnClickListener{
            nome = binding.editNomeProduto.text.toString()
            peso = binding.editPeso.text.toString().toDouble()
            valor = binding.editValor.text.toString().toDouble()
            mock.listaProdutoMock.add(Produto(nome,peso,valor))
            binding.recyclerviewLista.layoutManager = LinearLayoutManager(this)
            binding.recyclerviewLista.adapter = ListaProdutoAdapter(mock.listaProdutoMock)

            gravarUtilizadorDB(emailUser.toString())
        }



    }

    private fun gravarUtilizadorDB(emailUser: String){

        val dados = mapOf(
            "nome" to nome,
            "peso" to peso,
            "valor" to valor
        )


      val produto =  db.collection("Usuario").document(emailUser).collection("produtos")
         produto.add(dados).addOnSuccessListener {
            Toast.makeText(this, "item adicionado na no banco de dados", Toast.LENGTH_LONG).show()
        }.addOnFailureListener{
            Toast.makeText(this, "ERRO: item não adicionado", Toast.LENGTH_LONG).show()
        }

    }

    private fun loadData(emailUser: String){

      val produtos = db.collection("Usuario").document(emailUser).collection("produtos")

      produtos.get().addOnSuccessListener {  querySnapshot  ->
          if(querySnapshot != null){
              for(produto in querySnapshot){
                  nome = produto.data?.get("nome").toString()
                  peso = produto.data?.get("peso").toString().toDouble()
                  valor = produto.data?.get("valor").toString().toDouble()
                  mock.listaProdutoMock.add(Produto(nome,peso,valor))
                  binding.recyclerviewLista.layoutManager = LinearLayoutManager(this)
                  binding.recyclerviewLista.adapter = ListaProdutoAdapter(mock.listaProdutoMock)

              }

          }else{
              Toast.makeText(this, "ERRO: deu vazio", Toast.LENGTH_LONG).show()
          }

        }
    }


}
