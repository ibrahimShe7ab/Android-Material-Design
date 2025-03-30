package com.example.androidmaterialdesign

import android.os.Bundle
import android.view.inputmethod.InputBinding
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
 import com.example.androidmaterialdesign.databinding.CardViewBinding
import com.example.androidmaterialdesign.databinding.InputTextFieldBinding

class MainActivity : AppCompatActivity() {
//    lateinit var binding:ActivityMainBinding
//    lateinit var binding: CardViewBinding
    lateinit var binding: InputTextFieldBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        binding=ActivityMainBinding.inflate(layoutInflater)
        binding= InputTextFieldBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        callFab()
errorTextFiledHandling()

    }

    fun callFab(){
//binding.fab.setOnClickListener { Toast.makeText(this, "fab clicked", Toast.LENGTH_SHORT).show() }
   }

    fun  errorTextFiledHandling(){
        binding.saveButton.setOnClickListener {
        val input=binding .inoutText.text.toString()
        if (input.isEmpty()){
            binding.inputLayout.error="must not empty"
            binding.inputLayout.setErrorIconDrawable(R.drawable.ic_error)

        }else if (input.length>10){
            binding.inputLayout.error="must > 10"

        }else {
            binding.inputLayout.error = null
        }
    }
}
}