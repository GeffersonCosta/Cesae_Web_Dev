package com.example.exe01

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.exe01.databinding.ActivityInforUserBinding
import com.example.exe01.databinding.ActivityMainBinding

class inforUser_Activity : AppCompatActivity() {

    private val binding by lazy {
        ActivityInforUserBinding.inflate(layoutInflater)

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        val i = intent;
        val nome = i.extras?.getString("nome");
        val morada = i.extras?.getString("morada");
        val telefone = i.extras?.getString("telefone");
        val email = i.extras?.getString("email");

        binding.textResultadoTela2.text = "O ${nome} mora na rua ${morada}, tem o telefone${telefone} e o email ${email}";

    }

}