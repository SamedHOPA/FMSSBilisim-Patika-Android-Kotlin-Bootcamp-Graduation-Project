package com.example.graduationproject.ui.trip.tablayout.bookmark

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.graduationproject.databinding.FragmentTabBookmarkBinding

class TabBookmarkFragment : Fragment() {

    private lateinit var binding: FragmentTabBookmarkBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTabBookmarkBinding.inflate(layoutInflater)
        return binding.root
    }
}