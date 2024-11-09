package com.example.Login

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.login.databinding.ActivityOpcaoDeTelaBinding

class OpcaoDeTelaActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityOpcaoDeTelaBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.buttonListaProduto.setOnClickListener{
            val i: Intent = Intent(this, ListaProdutosActivity::class.java)
            startActivity(i)
        }
        binding.buttonListaTarefa.setOnClickListener{
            val i: Intent = Intent(this, FullscreenActivity::class.java)
            startActivity(i)
        }

    }
}