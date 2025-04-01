package com.example.androidmaterialdesign.bottom_nav

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.androidmaterialdesign.R
import com.example.androidmaterialdesign.databinding.FragmentFavoriteBinding


class FavoriteFragment : Fragment() {
    lateinit var binding: FragmentFavoriteBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentFavoriteBinding.inflate(inflater,container,false)
        return binding.root
    }

 }