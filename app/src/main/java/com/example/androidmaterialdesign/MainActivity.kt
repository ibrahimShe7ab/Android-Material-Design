package com.example.androidmaterialdesign

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.androidmaterialdesign.databinding.ActivityMainBinding
import com.example.androidmaterialdesign.databinding.CardViewBinding

class MainActivity : AppCompatActivity() {
//    lateinit var binding:ActivityMainBinding
    lateinit var binding: CardViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        binding=ActivityMainBinding.inflate(layoutInflater)
        binding= CardViewBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        callFab()


    }

    fun callFab(){
//binding.fab.setOnClickListener { Toast.makeText(this, "fab clicked", Toast.LENGTH_SHORT).show() }


    }

}