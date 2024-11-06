package com.example.login

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.view.WindowInsets
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.login.databinding.ActivityFullscreenBinding

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
class FullscreenActivity : AppCompatActivity() {

   /* private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }*/

   private lateinit var binding: ActivityFullscreenBinding

    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var mockTarefa = ListaTarefaMock()
        binding = ActivityFullscreenBinding.inflate(layoutInflater)

        setContentView(binding.root)
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.R){
            window.insetsController?.hide(WindowInsets.Type.statusBars())
        }else{
            window.addFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN
            )
        }
        mockTarefa.listaTarefaMock.add(ListaTarefa(1, "Hello"))
        binding.recyclerviewListaTarefa.layoutManager = LinearLayoutManager(this)
        binding.recyclerviewListaTarefa.adapter = ListaTarefaAdapter(mockTarefa.listaTarefaMock)

    }
}


