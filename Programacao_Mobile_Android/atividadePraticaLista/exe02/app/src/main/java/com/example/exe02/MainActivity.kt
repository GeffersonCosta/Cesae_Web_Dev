package com.example.exe02

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.example.exe02.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val listaNumeros = ArrayList<Int>();
        binding.buttonAdicionar.setOnClickListener{
         val numeroUser = binding.editTextText.text.toString().toInt()
            listaNumeros.add(numeroUser)
            binding.listaNumeros.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listaNumeros)
        }
    }
}