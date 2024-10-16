package com.example.parte1

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.parte1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(binding.root)
        var cont = 0;
        val listaDeProdutos = ArrayList<Produto>()

        binding.imageButtonAddProduto.setOnClickListener{
            cont++
            var nome = binding.editNovoProduto.text.toString();
            listaDeProdutos.add(Produto(cont, nome))
            val ArrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listaDeProdutos)
            binding.lista.adapter = ArrayAdapter
        }
        binding.imageButtonRemoverProduto.setOnClickListener {
            if(listaDeProdutos.size != 0){
                var item: Int = binding.editRemoverProduto.text.toString().toInt();
                for(elemento in listaDeProdutos){
                    if(elemento.posicao == item){
                        listaDeProdutos.remove(elemento)
                        break
                    }
                }
                val ArrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listaDeProdutos)
                binding.lista.adapter = ArrayAdapter
            }else{
                Toast.makeText(this, "Erro ao Deletar: Lista Vazia", Toast.LENGTH_LONG).show()
            }
        }

    }
}


