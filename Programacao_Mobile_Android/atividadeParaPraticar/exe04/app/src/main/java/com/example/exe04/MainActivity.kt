package com.example.exe04

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.exe04.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var pedido1 = "";
    var valorPedido1 = 0.0;
    var pedido2 = "";
    var valorPedido2 = 0.0;
    var pedido3 = "";
    var valorPedido3 = 0.0;
    var pedido4 = "";
    var valorPedido4 = 0.0;
    var pedido5 = "";
    var valorPedido5 = 0.0;
    var pedido6 = "";
    var valorPedido6 = 0.0;

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonRegistarPedido.setOnClickListener{
                if(binding.checkBoxPedido1.isChecked){
                    pedido1 = binding.checkBoxPedido1.text.toString();
                    valorPedido1 = binding.textViewValor1.text.toString().toDouble();
                }
                    if(binding.checkBoxPedido2.isChecked){
                        pedido2 = binding.checkBoxPedido2.text.toString();
                        valorPedido2 = binding.textViewValor2.text.toString().toDouble();
                    }
            if(binding.checkBoxPedido3.isChecked){
                pedido3 = binding.checkBoxPedido3.text.toString();
                valorPedido3 = binding.textViewValor3.text.toString().toDouble();
            }
            if(binding.checkBoxPedido4.isChecked){
                pedido4 = binding.checkBoxPedido4.text.toString();
                valorPedido4 = binding.textViewValor4.text.toString().toDouble();
            }
            if(binding.checkBoxPedido5.isChecked){
                pedido5 = binding.checkBoxPedido5.text.toString();
                valorPedido5 = binding.textViewValor5.text.toString().toDouble();
            }
            if(binding.checkBoxPedido6.isChecked){
                pedido6 = binding.checkBoxPedido6.text.toString();
                valorPedido6 = binding.textViewValor6.text.toString().toDouble();
            }


            val i: Intent = Intent(this, SplashScreenActivity::class.java);
            i.putExtra("pedido1", pedido1);
            i.putExtra("valorPedido1", valorPedido1)
            i.putExtra("pedido2", pedido2);
            i.putExtra("valorPedido2", valorPedido2)

            i.putExtra("pedido3", pedido3);
            i.putExtra("valorPedido3", valorPedido3)
            i.putExtra("pedido4", pedido4);
            i.putExtra("valorPedido4", valorPedido4)
            i.putExtra("pedido5", pedido5);
            i.putExtra("valorPedido5", valorPedido5)
            i.putExtra("pedido6", pedido6);
            i.putExtra("valorPedido6", valorPedido6)
            startActivity(i);
        }
    }
}