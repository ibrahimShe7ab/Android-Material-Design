package com.example.androidmaterialdesign.alert_dislog

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.androidmaterialdesign.R
import com.example.androidmaterialdesign.databinding.ActivityDialogBinding
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class DialogActivity : AppCompatActivity() {
    lateinit var binding: ActivityDialogBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDialogBinding.inflate(layoutInflater)
        setContentView(binding.root)

          dialog(this)
//        choiceItemDialog(this)
//        multiChoiceItemDialog(this)

    }












    private fun dialog(context: Context){
        MaterialAlertDialogBuilder(context)
            .setTitle(resources.getString(R.string.title))
            .setMessage(resources.getString(R.string.supporting_text))

             .setNeutralButton(resources.getString(R.string.cancel)) { dialog, which ->
dialog.cancel()
                Toast.makeText(context, "should accept", Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton(resources.getString(R.string.decline)) { dialog, which ->
 finish()
                Toast.makeText(context, "should accept", Toast.LENGTH_SHORT).show()

            }
            .setPositiveButton(resources.getString(R.string.accept)) { dialog, which ->
 dialog.dismiss()
                Toast.makeText(context, "accepted", Toast.LENGTH_SHORT).show()

            }
            .show()
   }

    private fun choiceItemDialog(context: Context){

        val singleItems = arrayOf("Item 1", "Item 2", "Item 3")
        val checkedItem = 1

        MaterialAlertDialogBuilder(context)
            .setTitle(resources.getString(R.string.title))
            .setNeutralButton(resources.getString(R.string.cancel)) { dialog, which ->
                // Respond to neutral button press
            }
            .setPositiveButton(resources.getString(R.string.accept)) { dialog, which ->
                // Respond to positive button press
            }
            // Single-choice items (initialized with checked item)
            .setSingleChoiceItems(singleItems, checkedItem) { dialog, which ->
                // Respond to item chosen
            }
            .show()
   }





    private fun multiChoiceItemDialog(context: Context){

        val multiItems = arrayOf("Item 1", "Item 2", "Item 3")
        val checkedItems = booleanArrayOf(true, false, false, false)

        MaterialAlertDialogBuilder(context)
            .setPositiveButton(resources.getString(R.string.accept)) { dialog, which -> }
            .setNegativeButton(resources.getString(R.string.cancel)) { dialog, which -> }
         .setMultiChoiceItems(multiItems, checkedItems) { dialog, which, checked ->
            // Respond to item chosen
        }

            .show()
    }







}