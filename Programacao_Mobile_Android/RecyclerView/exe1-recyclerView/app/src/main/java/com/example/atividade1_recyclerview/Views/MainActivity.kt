package com.example.atividade1_recyclerview.Views

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.atividade1_recyclerview.Adapter.CarroListAdapter
import com.example.atividade1_recyclerview.Data.CarroMock
import com.example.atividade1_recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        val binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)

        setContentView(binding.root)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val mock = CarroMock()
        binding.recyclerView.adapter = CarroListAdapter(mock.listaCarros)



    }
}