package com.example.graduationproject.ui.trip

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.graduationproject.ui.trip.tablayout.TripTablayoutAdapter
import com.example.graduationproject.databinding.FragmentTripBinding
import com.google.android.material.tabs.TabLayoutMediator

class TripFragment : Fragment() {

    private lateinit var tripFragmentBinding: FragmentTripBinding
    private var tabTitle = arrayOf("Trips","Bookmark")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        tripFragmentBinding = FragmentTripBinding.inflate(layoutInflater)
        return tripFragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val pager = tripFragmentBinding.viewPager2
        val tl = tripFragmentBinding.tabLayout

        pager.adapter = TripTablayoutAdapter(this)

        TabLayoutMediator(tl,pager){
                tab,position ->
            tab.text = tabTitle[position]
        }.attach()
    }
}