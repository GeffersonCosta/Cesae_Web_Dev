package com.example.exe04

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.exe04.databinding.ActivityPedidoFinalizadoBinding

class PedidoFinalizadoActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityPedidoFinalizadoBinding.inflate(layoutInflater)
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val i = intent;
        var pedido1 = i.extras?.getString("pedido1");
        var valor1 = i.extras!!.getDouble("valor1");

        var pedido2 = i.extras?.getString("pedido2");
        var valor2 = i.extras!!.getDouble("valor2");

        var pedido3 = i.extras?.getString("pedido3");
        var valor3 = i.extras!!.getDouble("valor3");

        var pedido4 = i.extras?.getString("pedido4");
        var valor4 = i.extras!!.getDouble("valor4");

        var pedido5 = i.extras?.getString("pedido5");
        var valor5 = i.extras!!.getDouble("valor5");

        var pedido6 = i.extras?.getString("pedido6");
        var valor6 = i.extras!!.getDouble("valor6");
        var soma = 0.0;
        if(pedido1 != ""){
            binding.textQuantidade1.text = "1 ${pedido1}"
            soma += valor1;
        }
        if(pedido2 != ""){
            binding.textQuantidade2.text = "1 ${pedido2}"
            soma += valor2;
        }
        if(pedido3 != ""){
            binding.textQuantidade3.text = "1 ${pedido3}"
            soma += valor3;
        }
        if(pedido4 != ""){
            binding.textQuantidade4.text = "1 ${pedido4}"
            soma += valor4;
        }
        if(pedido5 != ""){
            binding.textQuantidade5.text = "1 ${pedido5}"
            soma += valor5;
        }
        if(pedido6 != ""){
            binding.textQuantidade6.text = "1 ${pedido6}"
            soma += valor6;
        }
        binding.textTotal.text = "Total: ${soma}";

    }
}