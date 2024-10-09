package com.example.exe04

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.exe04.databinding.ActivityConfirmarNovaSenhaBinding

class ConfirmarNovaSenhaActivity : AppCompatActivity() {



    private val binding by lazy {
        ActivityConfirmarNovaSenhaBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val i = intent;
        val userName = i.extras?.getString("username")
        val email = i.extras?.getString("email")
        val cartaoCidadao = i.extras?.getString("cartaoCidadao")
        var listaUtilizadores = Utilizador.utilizadoresList

        binding.buttonAlteraNova.setOnClickListener{
          var novaSenha = binding.editNovaSenha.text.toString();
         for(elemento in listaUtilizadores){
             if(elemento.username.equals(userName) && elemento.email.equals(email) && elemento.cartaoCidadao.equals(cartaoCidadao)){
                 elemento.password = novaSenha;
                 Toast.makeText(this, "Senha Alterada com Sucesso", Toast.LENGTH_LONG).show()
             }
         }
        }
    }
}