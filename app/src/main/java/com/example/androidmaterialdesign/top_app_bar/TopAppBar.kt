package com.example.androidmaterialdesign.top_app_bar

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.androidmaterialdesign.R
import com.example.androidmaterialdesign.databinding.ActivityTopAppBarBinding

class TopAppBar : AppCompatActivity() {
    lateinit var binding: ActivityTopAppBarBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityTopAppBarBinding.inflate(layoutInflater)
        setContentView(binding.root)
        handleAppBar()
    }


    private fun handleAppBar(){

       binding.topAppBar.setNavigationOnClickListener {
            // Handle navigation icon press
        }

        binding.topAppBar.setOnMenuItemClickListener { menuItem ->
            when (menuItem.itemId) {
                R.id.appBarHome -> {
                    Toast.makeText(this, "appBarHome", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.appBarFavorite -> {
                    Toast.makeText(this, "appBarFavorite", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.appBarNotification -> {
                    Toast.makeText(this, "appBarNotification", Toast.LENGTH_SHORT).show()
                    true
                }
                else -> false
            }
        }
    }

}