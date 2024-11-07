package com.example.login

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.view.WindowInsets
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.login.adapter.ListaTarefaAdapter
import com.example.login.data.ListaTarefaMock
import com.example.login.databinding.ActivityFullscreenBinding
import com.example.login.model.ListaTarefa

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
class FullscreenActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityFullscreenBinding.inflate(layoutInflater)
    }
   private var mock = ListaTarefaMock()
   /*private lateinit var binding: ActivityFullscreenBinding*/

    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /*binding = ActivityFullscreenBinding.inflate(layoutInflater)*/

        setContentView(binding.root)
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.R){
            window.insetsController?.hide(WindowInsets.Type.statusBars())
        }else{
            window.addFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN
            )
        }

        var idTarefa = 4
        var descricao = "Limpar tudo"
       mock.listaTarefaMock.add(ListaTarefa(idTarefa, descricao))
        binding.recyclerviewListaTarefa.layoutManager = LinearLayoutManager(this)
        binding.recyclerviewListaTarefa.adapter = ListaTarefaAdapter(mock.listaTarefaMock)

    }
}


