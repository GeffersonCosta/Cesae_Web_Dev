package com.example.exe02

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.exe02.databinding.ActivityUser3Binding

class UserActivity3 : AppCompatActivity() {

    private val binding by lazy {
        ActivityUser3Binding.inflate(layoutInflater)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(binding.root)

        binding.buttonActivi3Resultado.setOnClickListener{

         val i = intent
         val j = intent
         val numero1 = i.extras?.getDouble("numero1");
         val numero2 = j.extras?.getDouble("numero2");
         val somaDosDoisNumeros = numero1;
         binding.textSomaDoDoisNumeros.text = "${somaDosDoisNumeros}";



        }

    }
}