package com.example.exe02

import android.content.Intent
import android.os.Bundle
import androidx.activity.result.ActivityResultLauncher
import androidx.appcompat.app.AppCompatActivity
import com.example.exe02.databinding.ActivityMainBinding

private lateinit var result: ActivityResultLauncher<Intent>

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonMain.setOnClickListener{


           val numero1 = binding.editNumberactyMain.text.toString().toDouble();
            val i: Intent = Intent(this, UserActivity2::class.java);
            i.putExtra("numero1", numero1);
            result.launch(i);


        }
    }
}