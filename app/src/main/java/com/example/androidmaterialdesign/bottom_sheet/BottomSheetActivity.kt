package com.example.androidmaterialdesign.bottom_sheet

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.androidmaterialdesign.R
import com.example.androidmaterialdesign.databinding.ActivityBottomSheetBinding
import com.google.android.material.bottomsheet.BottomSheetBehavior

class BottomSheetActivity : AppCompatActivity() {
    lateinit var binding: ActivityBottomSheetBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityBottomSheetBinding.inflate(layoutInflater)
         setContentView(binding.root)

val bottomSheetFragment= BottomSheetFragment()
        binding.fab.setOnClickListener {

            bottomSheetFragment.show(supportFragmentManager, BottomSheetFragment.TAG)
        }


    }





}