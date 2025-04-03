package com.example.androidmaterialdesign.siders

import android.content.Context
import android.media.AudioManager
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.androidmaterialdesign.R
import com.example.androidmaterialdesign.databinding.ActivitySlidersBinding
import com.google.android.material.slider.Slider

class SlidersActivity : AppCompatActivity() {
    lateinit var binding: ActivitySlidersBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySlidersBinding.inflate(layoutInflater)
         setContentView(binding.root)

        handleSlider(this)
    }


    private fun handleSlider(context: Context){
        binding.discreteSlider.addOnSliderTouchListener(object : Slider.OnSliderTouchListener {
            override fun onStartTrackingTouch(slider: Slider) {
                // Responds to when slider's touch event is being started
                Toast.makeText(context, "passed", Toast.LENGTH_SHORT).show()
            }

            override fun onStopTrackingTouch(slider: Slider) {
                // Responds to when slider's touch event is being stopped
                Toast.makeText(context," volume is  ${ slider.value}", Toast.LENGTH_SHORT).show()

            }
        })

        binding.discreteSlider.addOnChangeListener { slider, value, fromUser ->
            // Responds to when slider's value is changed

        }

    }

}