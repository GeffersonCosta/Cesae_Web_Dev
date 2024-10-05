package com.example.exe03

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.exe03.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var nomeUser = "";
    var passwordUser = "";


    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonRegistar.setOnClickListener{
           startActivity(Intent(this, RegistoActivity::class.java))
        }
        binding.buttonLogin.setOnClickListener{
            val i = intent
            val user = i.extras?.getString("user")
            val password = i.extras?.getString("password")
            nomeUser = binding.editTextUser.text.toString();
            passwordUser = binding.editTextPassword.text.toString();
            if(nomeUser == user && passwordUser == password){
                startActivity( Intent(this, SobreActivity::class.java));
            }
            else{
                Toast.makeText(this, "Erro ao efetuar Login", Toast.LENGTH_SHORT).show()
                binding.editTextUser.text.clear()
                binding.editTextPassword.text.clear()
            }
        }




    }
}