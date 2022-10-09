package com.example.graduationproject.ui.detail

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.graduationproject.databinding.FragmentDetailBinding
import com.squareup.picasso.Picasso

class DetailFragment : Fragment() {

    private lateinit var binding: FragmentDetailBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDetailBinding.inflate(layoutInflater)
        return binding.root
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val sharedPreferences = activity?.getSharedPreferences("mars_content", Context.MODE_PRIVATE)
        val imgUrl = sharedPreferences?.getString("img_src","")

        binding.apply {
            DetailTitle.text = sharedPreferences?.getString("title","")
            val country = sharedPreferences?.getString("country","")
            val city = sharedPreferences?.getString("city","")
            DetailCountry.text = "$country"+"$city"
            DetailDescription.text = sharedPreferences?.getString("description","")
            Picasso.get().load(imgUrl).resize(411,450).into(imgDetail)
        }
    }

}