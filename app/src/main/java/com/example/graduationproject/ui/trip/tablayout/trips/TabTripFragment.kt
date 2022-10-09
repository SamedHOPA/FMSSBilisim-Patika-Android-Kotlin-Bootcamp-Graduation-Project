package com.example.graduationproject.ui.trip.tablayout.trips

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.graduationproject.databinding.FragmentTabTripBinding

class TabTripFragment : Fragment() {

    private lateinit var binding: FragmentTabTripBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTabTripBinding.inflate(layoutInflater)
        return binding.root
    }
}