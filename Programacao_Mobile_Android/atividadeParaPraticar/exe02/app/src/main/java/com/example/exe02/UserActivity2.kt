package com.example.exe02

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.exe02.databinding.ActivityUser2Binding

class UserActivity2 : AppCompatActivity() {

    private val binding by lazy {
        ActivityUser2Binding.inflate(layoutInflater);
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val i = intent;

        val numero = i.extras?.getString("numero")

        binding.textView2.text = "Resultado: ${numero}";




    }
}