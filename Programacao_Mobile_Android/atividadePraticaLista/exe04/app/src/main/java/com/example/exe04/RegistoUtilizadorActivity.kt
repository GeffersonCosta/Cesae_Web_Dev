package com.example.exe04

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.exe04.Utilizador.DataHolder.utilizadoresList
import com.example.exe04.databinding.ActivityMainBinding
import com.example.exe04.databinding.ActivityRegistoUtilizadorBinding

class RegistoUtilizadorActivity : AppCompatActivity() {




    private val binding by lazy{
        ActivityRegistoUtilizadorBinding.inflate(layoutInflater)
    }

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

            Utilizador.DataHolder.utilizadoresList.add(Utilizador(nameUser, username, password, email, telefone, cartaoCidadao))
            val i: Intent = Intent(this, MainActivity::class.java)
            startActivity(i)

        }
    }
}

