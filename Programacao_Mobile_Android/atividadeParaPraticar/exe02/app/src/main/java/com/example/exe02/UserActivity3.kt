package com.example.exe02

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.exe02.databinding.ActivityUser3Binding
import kotlin.math.abs

class UserActivity3 : AppCompatActivity() {

    private val binding by lazy {
        ActivityUser3Binding.inflate(layoutInflater)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(binding.root)

        binding.buttonActivi3Resultado.setOnClickListener{



         val j = intent;

         val numero1 = j.extras!!.getDouble("numero1");
         val numero2 = j.extras!!.getDouble("numero2");
            var soma = numero1 + numero2;
            var difereca = abs(numero1 - numero2)
            var mult = numero1 * numero2;
            var divInteira = numero1.toInt() / numero2.toInt();
            binding.textSomaDoDoisNumeros.text = "Soma entre ${numero1} + ${numero2} = ${soma.toString()}";
            binding.textDiferencaEntreOsNumeros.text = "diferença entre ${numero1} e ${numero2} = ${difereca.toString()}";
            binding.textProduto.text = "O produto entre ${numero1} e ${numero2} = ${mult.toString()}"
            binding.textDivisaoInteira.text = "A divisão inteira entre ${numero1} e ${numero2} = ${divInteira.toString()}"



        }

    }
}