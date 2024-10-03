package com.example.exe02

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.exe02.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonMain.setOnClickListener{

            val numero = binding.editNumberactyMain.text.toString();

            val i: Intent = Intent(this, UserActivity2::class.java);

            i.putExtra("numero", numero);
            startActivity(i);


            /*TESTE*/
           /* var soma = numero + 10;
            binding.textView4.text = "Resultado: ${soma.toString()}";*/


        }
    }
}