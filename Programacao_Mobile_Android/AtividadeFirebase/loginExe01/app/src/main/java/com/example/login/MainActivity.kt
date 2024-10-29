package com.example.login

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

               auth.signInWithEmailAndPassword(email, password)
                .addOnSuccessListener {
                    Toast.makeText(this, "Login efetuado", Toast.LENGTH_LONG).show()
                    val i: Intent = Intent(this, ListaProdutosActivity::class.java)
                    i.putExtra("email", email)
                    startActivity(i)
                }
                .addOnFailureListener{
                    Toast.makeText(this, "Erro ao efetuar login", Toast.LENGTH_LONG).show()
                }
        }



        binding.textCriarConta.setOnClickListener{
            val i: Intent = Intent(this, RegistoActivity::class.java)
            startActivity(i)

        }

    }
}