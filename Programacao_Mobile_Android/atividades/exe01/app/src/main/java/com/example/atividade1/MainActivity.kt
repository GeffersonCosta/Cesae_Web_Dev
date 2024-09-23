package com.example.atividade1

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.atividade1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(binding.root)
        binding.buttonMensagem.setOnClickListener{
            Toast.makeText(applicationContext, "O botão foi clicado", Toast.LENGTH_LONG).show()
        }
        binding.buttonSegundaTela.setOnClickListener{
            val intent = Intent(this, NovaTelaActivity2::class.java)
            startActivity(intent)
        }
    }
}