package com.example.androidmaterialdesign.bottom_nav

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.androidmaterialdesign.databinding.FragmentHomeBinding
import com.example.androidmaterialdesign.databinding.FragmentNotificationBinding

class NotificationFragment : Fragment() {
   lateinit var binding: FragmentNotificationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
     binding= FragmentNotificationBinding.inflate(inflater,container,false)
     return binding.root
    }

 }