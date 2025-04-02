package com.example.androidmaterialdesign.bottom_sheet

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.androidmaterialdesign.R
import com.example.androidmaterialdesign.databinding.ActivityDrawerBinding
import com.example.androidmaterialdesign.databinding.FragmentBottomSheetBinding
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class BottomSheetFragment :BottomSheetDialogFragment() {
 lateinit var binding : FragmentBottomSheetBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentBottomSheetBinding.inflate(inflater,container,false)
         return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.button.setOnClickListener { dismiss() }


        dialog?.setOnShowListener { dialogInterface ->
            val bottomSheetDialog = dialogInterface as BottomSheetDialog
            val bottomSheet = bottomSheetDialog.findViewById<View>(com.google.android.material.R.id.design_bottom_sheet)

            bottomSheet?.let {
                val behavior = BottomSheetBehavior.from(it)
                behavior.peekHeight = (resources.displayMetrics.heightPixels * 0.5).toInt()
                it.layoutParams.height = (resources.displayMetrics.heightPixels * 0.5).toInt()
                it.requestLayout()
            }
        }
    }

    companion object {
        const val TAG = "ModalBottomSheet"
    }

}