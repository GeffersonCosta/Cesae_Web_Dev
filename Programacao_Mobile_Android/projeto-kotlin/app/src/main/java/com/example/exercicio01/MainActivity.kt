package com.example.exercicio01

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.exercicio01.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(binding.root)


        binding.buttonMostrar.setOnClickListener{
            val userNome = binding.editNome.text.toString()
            val userUltimoNome = binding.editSobrenome.text.toString()
            if(userNome == "" || userUltimoNome == ""){
                binding.textResultado.text = "nome não inserido";
            }
            else{
               Toast.makeText(applicationContext, "Olá  $userNome $userUltimoNome", Toast.LENGTH_SHORT).show()
                binding.editSobrenome.text.clear();
                binding.editNome.text.clear();
            }

        }

    }
}