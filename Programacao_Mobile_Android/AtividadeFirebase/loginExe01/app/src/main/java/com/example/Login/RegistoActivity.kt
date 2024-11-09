package com.example.Login

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.login.databinding.ActivityRegistoBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore

class RegistoActivity : AppCompatActivity() {


    private val binding by lazy{
        ActivityRegistoBinding.inflate(layoutInflater)
    }
    private val auth by lazy{
        FirebaseAuth.getInstance()
    }
    private val db by lazy{
        FirebaseFirestore.getInstance()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonRegistar.setOnClickListener{
            val email = binding.editRegistarEmail.text.toString();
            val password = binding.editRegistarPassword.text.toString();
            if(email.isEmpty() || password.isEmpty()){
                Toast.makeText(this, "ERRO: Prencha os campos corretamente", Toast.LENGTH_SHORT).show()
            }
            else{
                auth.createUserWithEmailAndPassword(email, password)
                    .addOnSuccessListener {
                        Toast.makeText(this, "Registo efetuado com sucesso", Toast.LENGTH_SHORT).show()
                        auth.currentUser?.sendEmailVerification()

                        val intent = Intent(this, MainActivity::class.java)
                        startActivity(intent)
                    }
                    .addOnFailureListener{
                        Toast.makeText(this, "Erro ao registar", Toast.LENGTH_LONG).show()
                    }
            }

        }

    }


}