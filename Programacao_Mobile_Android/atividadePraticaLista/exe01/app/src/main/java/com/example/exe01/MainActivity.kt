package com.example.exe01

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.exe01.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val listaDeNome = ArrayList<String>();

        listaDeNome.add("Gefferson");
        listaDeNome.add("Henrique");
        listaDeNome.add("Rodrigues");
        listaDeNome.add("Costa");

       val ArrayAdapter  = ArrayAdapter(this, android.R.layout.simple_list_item_1, listaDeNome)
        binding.listaDeNomes.adapter = ArrayAdapter;


        binding.listaDeNomes.setOnItemClickListener{ parent, view, position, id ->
            Toast.makeText(this, "Olá ${listaDeNome.get(position)}", Toast.LENGTH_LONG).show()

        }

    }
}