package com.example.exe02

import android.content.Intent
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

        binding.buttonActi2.setOnClickListener{

            val i = intent;
            val numero1 = i.extras?.getDouble("numero1")
            val numero2 = binding.editNumberActivi2.text.toString().toDouble();
            val j: Intent = Intent(this, UserActivity3::class.java)
            j.putExtra("numero2", numero2)
            j.putExtra("numero1", numero1)
            startActivity(j);

        }

    }
}