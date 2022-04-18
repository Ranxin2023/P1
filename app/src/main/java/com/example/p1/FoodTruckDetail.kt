package com.example.p1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.p1.databinding.ActivityFoodTruckDetailBinding

class FoodTruckDetail :AppCompatActivity(){
    private lateinit var binding:ActivityFoodTruckDetailBinding
    override fun onCreate(savedInstanceState:Bundle?){
        super.onCreate(savedInstanceState)
        binding= ActivityFoodTruckDetailBinding.inflate(layoutInflater)
        var view =binding.root
        setContentView(view)
    }
}