package com.example.exe04

import android.content.Intent
import android.os.Bundle
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class SplashScreenActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val j = intent
        val pedido1 = j.extras?.getString("pedido1");
        val valor1 = j.extras?.getDouble("valorPedido1");

        val pedido2 = j.extras?.getString("pedido2");
        val valor2 = j.extras?.getDouble("valorPedido2");

        val pedido3 = j.extras?.getString("pedido3");
        val valor3 = j.extras?.getDouble("valorPedido3");

        val pedido4 = j.extras?.getString("pedido4");
        val valor4 = j.extras?.getDouble("valorPedido4");

        val pedido5 = j.extras?.getString("pedido5");
        val valor5 = j.extras?.getDouble("valorPedido5");

        val pedido6 = j.extras?.getString("pedido6");
        val valor6 = j.extras?.getDouble("valorPedido6");



        android.os.Handler(Looper.getMainLooper()).postDelayed({
            val i: Intent = Intent(this, PedidoFinalizadoActivity::class.java)
            i.putExtra("pedido1", pedido1);
            i.putExtra("valor1", valor1);

            i.putExtra("pedido2", pedido2);
            i.putExtra("valor2", valor2);

            i.putExtra("pedido3", pedido3);
            i.putExtra("valor3", valor3);

            i.putExtra("pedido4", pedido4);
            i.putExtra("valor4", valor4);

            i.putExtra("pedido5", pedido5);
            i.putExtra("valor5", valor5);

            i.putExtra("pedido6", pedido6);
            i.putExtra("valor6", valor6);
            startActivity(i);
            finish()
        }, 3000)


    }
}