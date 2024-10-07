package com.example.exe03

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.exe03.databinding.ActivityInformationAlunoBinding

class InformationAlunoActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityInformationAlunoBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val i = intent;
        val nome = i.extras?.getString("nome")
        val morada = i.extras?.getString("morada")
        val email = i.extras?.getString("email")

        binding.textInformacaoCompleta.text = "Nome: ${nome} \n Morada: ${morada} \n Email: ${email}"


    }
}