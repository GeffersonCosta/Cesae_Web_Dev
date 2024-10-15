package com.example.oclockapp

import androidx.appcompat.app.AppCompatActivity
import android.annotation.SuppressLint
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.BatteryManager
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.MotionEvent
import android.view.View
import android.view.Window
import android.view.WindowInsets
import android.view.WindowManager
import android.widget.LinearLayout
import android.widget.TextView
import com.example.oclockapp.databinding.ActivityFullscreenBinding

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
class FullscreenActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityFullscreenBinding.inflate(layoutInflater)
    }

    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        var isChecked = true
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            window.insetsController?.hide(WindowInsets.Type.statusBars())
        } else {
            window.addFlags(
              WindowManager.LayoutParams.FLAG_FULLSCREEN
            )
        }

        val bateriaReceiver: BroadcastReceiver = object : BroadcastReceiver(){
            override fun onReceive(context: Context?, intent: Intent?) {
               if(intent != null){
                   val nivel: Int = intent.getIntExtra(BatteryManager.EXTRA_LEVEL,0)
                   binding.textNivelBateria.text = "${nivel.toString()}%";
               }
            }

        }
        registerReceiver(bateriaReceiver, IntentFilter(Intent.ACTION_BATTERY_CHANGED))

        binding.checkBox.setOnClickListener{
            if(isChecked){
                isChecked = false
                binding.checkBox.isChecked = false
                binding.textNivelBateria.visibility = View.GONE
            }
            else{
                isChecked = true
                binding.checkBox.isChecked = true
                binding.textNivelBateria.visibility = View.VISIBLE
            }
        }

    }
}






