package com.example.exe04

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.exe04.databinding.ActivityAlterarSenhaMainBinding

class AlterarSenhaMainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityAlterarSenhaMainBinding.inflate(layoutInflater)
    }
    var listarUser = Utilizador.utilizadoresList;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonVerificarInformacoes.setOnClickListener{
            var username = binding.editVerificarUserName.text.toString();
            var email = binding.editVerificarEmail.text.toString();
            var cartaoCidadao = binding.editVerificarCC.text.toString();
            for(listaUsuario in listarUser ){
                if(listaUsuario.username.equals(username) && listaUsuario.email.equals(email) && listaUsuario.cartaoCidadao.equals(cartaoCidadao)){
                    val i: Intent = Intent(this, ConfirmarNovaSenhaActivity::class.java)
                    i.putExtra("username", username)
                    i.putExtra("email", email)
                    i.putExtra("cartaoCidadao", cartaoCidadao)
                    startActivity(i);
                }
            }
        }
    }
}