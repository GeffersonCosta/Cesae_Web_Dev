package com.example.exe04

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.exe04.databinding.ActivityMainBinding
import com.example.exe04.databinding.ActivityRegistoUtilizadorBinding

class RegistoUtilizadorActivity : AppCompatActivity() {
    private val binding by lazy{
        ActivityRegistoUtilizadorBinding.inflate(layoutInflater)
    }
    val listaUtilizadores = ArrayList<Utilizador>();
    var username = "";
    var password = "";
    var nameUser = "";
    var email = "";
    var telefone = "";
    var cartaoCidadao = "";



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonRegitarUtilizador.setOnClickListener{

            nameUser = binding.editTextName.text.toString();
            username = binding.editTextUserName.text.toString();
            password = binding.editTextPassword.text.toString();
            email = binding.editTextEmail.text.toString();
            telefone = binding.editTextTelemovel.text.toString();
            cartaoCidadao = binding.editTextCC.text.toString();

        }
    }
}