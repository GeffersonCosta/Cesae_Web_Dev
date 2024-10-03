package com.example.exe01

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.exe01.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private val binding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonEnviar.setOnClickListener{


            val morada = binding.editTextMorada.text.toString();
            var nome = binding.editTextNome.text.toString();
            val telefone = binding.editTextTelefone.text.toString();
            val email = binding.editTextTextEmail.text.toString();

            val i: Intent = Intent(this, inforUser_Activity::class.java)

            i.putExtra("nome", nome)
            i.putExtra("morada", morada)
            i.putExtra("telefone", telefone)
            i.putExtra("email", email)
            startActivity(i)


            binding.editTextMorada.text.clear();
            binding.editTextNome.text.clear();
            binding.editTextTelefone.text.clear();
            binding.editTextTextEmail.text.clear();




        }
    }


}