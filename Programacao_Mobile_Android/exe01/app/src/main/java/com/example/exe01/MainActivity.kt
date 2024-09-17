package com.example.exe01

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.exe01.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.buttonConvert.setOnClickListener{

            val euros = binding.buttonConvert.text.toString().toDouble()
            val dolar = euros * 1.1
            binding.textResult.text = "$dolar"


        }

    }



}