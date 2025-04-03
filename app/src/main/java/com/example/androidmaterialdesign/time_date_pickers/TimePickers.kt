package com.example.androidmaterialdesign.time_date_pickers

import android.os.Bundle
import android.text.format.DateFormat.is24HourFormat
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.androidmaterialdesign.R
import com.example.androidmaterialdesign.databinding.ActivityTimePickersBinding
import com.google.android.material.datepicker.MaterialDatePicker
import com.google.android.material.timepicker.MaterialTimePicker
import com.google.android.material.timepicker.TimeFormat

class TimePickers : AppCompatActivity() {
    lateinit var binding: ActivityTimePickersBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityTimePickersBinding.inflate(layoutInflater)
         setContentView(binding.root)
          callback()
     }

    private fun callback() {
        binding.picker.setOnClickListener { timePicker() }
        binding.datePicker.setOnClickListener {datePacker()}
    }

    private fun timePicker() {
             val isSystem24Hour = is24HourFormat(this)
            val clockFormat = if (isSystem24Hour) TimeFormat.CLOCK_24H else TimeFormat.CLOCK_12H

             val picker = MaterialTimePicker.Builder()
                .setTimeFormat(clockFormat)
                .setHour(4)
                .setMinute(44)
                 .setTheme(R.style.Theme_App)
                  .setTitleText("Select Appointment time")
                .build()

             picker.show(supportFragmentManager, "timePicker")

             picker.addOnPositiveButtonClickListener {
                val selectedHour = picker.hour
                val selectedMinute = picker.minute
                 Toast.makeText(this, "الوقت المختار: $selectedHour:$selectedMinute", Toast.LENGTH_SHORT).show()
            }
        picker.addOnNegativeButtonClickListener {
            Toast.makeText(this, "time not selected", Toast.LENGTH_SHORT).show()
        }
        picker.addOnCancelListener {
            Toast.makeText(this, "time selected cancel", Toast.LENGTH_SHORT).show()
        }
        picker.addOnDismissListener {
            Toast.makeText(this, "finish", Toast.LENGTH_SHORT).show()        }



        }

    private fun datePacker(){
        val datePicker =
            MaterialDatePicker.Builder.datePicker()
                .setTitleText("Select date")
                .setSelection(MaterialDatePicker.todayInUtcMilliseconds())
                .build()

        datePicker.show(supportFragmentManager,"datePicker")


    }




    }



