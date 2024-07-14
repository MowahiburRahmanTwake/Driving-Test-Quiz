package com.example.drivingtestquiz.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.drivingtestquiz.databinding.FragmentQuizBinding


class QuizFragment: Fragment() {

    private lateinit var binding : FragmentQuizBinding

    override fun onCreateView(inflater : LayoutInflater, container : ViewGroup?, savedInstanceState : Bundle?) : View? {
        binding = FragmentQuizBinding.inflate(layoutInflater)
        return binding.root
    }



    override fun onViewCreated(view : View, savedInstanceState : Bundle?)
    {
        super.onViewCreated(view, savedInstanceState)
    }
}