package com.example.exe04

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.exe04.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

       val utilizadoresLista = Utilizador.utilizadoresList



        binding.buttoLogin.setOnClickListener{
         for(elemento in utilizadoresLista){
             if(binding.editTextUserName.text.toString().equals(elemento.username) && binding.editTextTextPassword.text.toString().equals(elemento.password)){
                 val j: Intent = Intent(this, UserInformationMainActivity::class.java)
                 j.putExtra("name", elemento.nome)
                 j.putExtra("username", elemento.username)
                 j.putExtra("password", elemento.password)
                 j.putExtra("email", elemento.email)
                 j.putExtra("telefone", elemento.telemovel)
                 j.putExtra("cartaoCidadao", elemento.cartaoCidadao)
                 startActivity(j)
             }



         }
            if(binding.editTextUserName.text.toString().equals("") || binding.editTextTextPassword.text.toString().equals("")){
                Toast.makeText(this, "Erro no login: Digite Username e Password", Toast.LENGTH_LONG).show()
            }
        }
        binding.buttonRegitar.setOnClickListener{
         startActivity(Intent(this, RegistoUtilizadorActivity::class.java))
        }
        binding.buttonAlterarSenha.setOnClickListener{
            val intent = Intent(this, AlterarSenhaMainActivity::class.java)
            startActivity(intent)
        }



    }
}