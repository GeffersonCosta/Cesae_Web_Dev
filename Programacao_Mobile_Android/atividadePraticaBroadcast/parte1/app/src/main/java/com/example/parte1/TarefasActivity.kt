package com.example.parte1

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.BatteryManager
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.parte1.databinding.ActivityMainBinding
import com.example.parte1.databinding.ActivityTarefasBinding

class TarefasActivity : AppCompatActivity() {


    private val binding by lazy {
        ActivityTarefasBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        val bateriaReceiver: BroadcastReceiver = object : BroadcastReceiver() {
            override fun onReceive(Context: Context, intent: Intent?) {
                if (intent != null) {
                    val nivel: Int = intent.getIntExtra(BatteryManager.EXTRA_LEVEL, 0)
                    while(nivel != 0){
                        if(nivel >= 100){
                            binding.imageBateriaNivel.setImageResource(R.mipmap.bateria7)
                        }
                        if(nivel <= 90){
                            binding.imageBateriaNivel.setImageResource(R.mipmap.bateria6)
                        }
                        if(nivel <= 70){
                            binding.imageBateriaNivel.setImageResource(R.mipmap.bateria5)
                        }
                        if(nivel <= 50){
                            binding.imageBateriaNivel.setImageResource(R.mipmap.bateria4)
                        }
                        if(nivel <= 20){
                            binding.imageBateriaNivel.setImageResource(R.mipmap.bateria3)
                        }
                        if(nivel <= 10){
                            binding.imageBateriaNivel.setImageResource(R.mipmap.bateria2)
                        }
                        if(nivel <= 5){
                            binding.imageBateriaNivel.setImageResource(R.mipmap.bateria1)
                        }
                        break
                    }



                }

            }
        }
        registerReceiver(bateriaReceiver, IntentFilter(Intent.ACTION_BATTERY_CHANGED))


    }

}