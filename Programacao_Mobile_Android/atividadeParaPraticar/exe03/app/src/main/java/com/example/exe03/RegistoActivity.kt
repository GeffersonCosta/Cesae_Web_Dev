package com.example.exe03

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.exe03.databinding.ActivityRegistoBinding

class RegistoActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityRegistoBinding.inflate(layoutInflater)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonConfirmarRegisto.setOnClickListener{
          val nome = binding.editTextNameRegisto.text.toString();
          val user = binding.editTextUserRegisto.text.toString();
          val password = binding.editTextTextPasswordRegisto.text.toString();

          val i = Intent(this, MainActivity::class.java);
          i.putExtra("nome", nome);
            i.putExtra("user", user);
            i.putExtra("password", password);
            startActivity(i);
        }
    }
}