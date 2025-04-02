package com.example.androidmaterialdesign.ui

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.androidmaterialdesign.databinding.ChipGroupBinding
import com.google.android.material.chip.Chip

class MainActivity : AppCompatActivity() {
//    lateinit var binding:ActivityMainBinding
//    lateinit var binding: CardViewBinding
//    lateinit var binding: InputTextFieldBinding
    lateinit var binding: ChipGroupBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        binding=ActivityMainBinding.inflate(layoutInflater)
//        binding=ActivityMainBinding.inflate(layoutInflater)
        binding= ChipGroupBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        callFab()
//errorTextFiledHandling()
        callback()
      }

    private fun callback() {
        binding.apply {
            chip1.setOnClickListener { chipClicked(it) }
            chip2.setOnClickListener { chipClicked(it) }
            chip3.setOnClickListener { chipClicked(it) }
            chip4.setOnClickListener { chipClicked(it) }
            chip5.setOnClickListener { chipClicked(it) }
            chip6.setOnClickListener { chipClicked(it) }
            chip7.setOnClickListener { chipClicked(it) }
            chip8.setOnClickListener { chipClicked(it) }


        }
    }

    fun callFab(){
//binding.fab.setOnClickListener { Toast.makeText(this, "fab clicked", Toast.LENGTH_SHORT).show() }
   }

//    fun  errorTextFiledHandling(){
//        binding.saveButton.setOnClickListener {
//        val input=binding .inoutText.text.toString()
//        if (input.isEmpty()){
//            binding.inputLayout.error="must not empty"
//            binding.inputLayout.setErrorIconDrawable(R.drawable.ic_error)
//
//        }else if (input.length>10){
//            binding.inputLayout.error="must > 10"
//
//        }else {
//            binding.inputLayout.error = null
//        }
//    }
//}
private fun chipClicked(view: View) {
    val chip = view as Chip
    Toast.makeText(this, "تم اختيار: ${chip.text}", Toast.LENGTH_SHORT).show()
}

    }