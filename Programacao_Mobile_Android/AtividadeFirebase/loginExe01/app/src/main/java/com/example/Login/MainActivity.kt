package com.example.Login

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.login.databinding.ActivityMainBinding
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    private val auth by lazy{
        FirebaseAuth.getInstance()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonLogin.setOnClickListener{
            val email = binding.editEmail.text.toString();
            val password = binding.editPassword.text.toString();
            if(!email.isEmpty() && !password.isEmpty()){
                auth.signInWithEmailAndPassword(email, password)
                    .addOnSuccessListener {
                        Toast.makeText(this, "Login efetuado", Toast.LENGTH_LONG).show()
                       val i: Intent = Intent(this, OpcaoDeTelaActivity::class.java)
                        binding.editEmail.text.clear()
                        binding.editPassword.text.clear()
                        startActivity(i)
                    }
                    .addOnFailureListener{
                        Toast.makeText(this, "Erro: Utilizador não localizado", Toast.LENGTH_LONG).show()
                    }
            }else{
                Toast.makeText(this, "Erro no login: Digite Username e Password", Toast.LENGTH_LONG).show()
            }


        }



        binding.textCriarConta.setOnClickListener{
            val i: Intent = Intent(this, RegistoActivity::class.java)
            startActivity(i)

        }

    }
}