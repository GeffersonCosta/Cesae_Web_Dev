package com.example.exe04

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.exe04.databinding.ActivityMainBinding
import com.example.exe04.databinding.ActivityRegistoUtilizadorBinding
import com.example.exe04.databinding.ActivityUserInformationMainBinding

class UserInformationMainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityUserInformationMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        var listaUser = Utilizador.utilizadoresList
        val i = intent;
        val nameUser = i.extras?.getString("name")
        val username = i.extras?.getString("username")
        val password = i.extras?.getString("password")
        val email = i.extras?.getString("email")
        var telefone = i.extras?.getString("telefone")
        val cartaoCidadao = i.extras?.getString("cartaoCidadao")

        binding.textComprimentarUser.text = "Olá ${nameUser}"
        binding.textViewDadosUser.text = "\n Username: ${username} \n Email: ${email} \n CC: ${cartaoCidadao} "
        binding.textTelefone.text = "${telefone}"
        binding.buttonOk.setOnClickListener{
            var novoNumero = binding.editTelefone.text.toString()
            for(listaUsuario in listaUser){
                if(listaUsuario.cartaoCidadao.equals(cartaoCidadao)){
                    binding.textTelefone.text = novoNumero
                    listaUsuario.telemovel = novoNumero;
                }
            }
        }




    }




    }
