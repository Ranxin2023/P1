package com.example.p1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.p1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val foods= listOf(
        Food(
            0,
            "Authentic Street Taco",
            "Silo Patio",
            "11am - 4pm",
            0
        ),
        Food(
            1,
            "Buckhorn Grill",
            "Silo Patio",
            "10am - 2pm",
            1
        ),
        Food(
            2,
            "Shah's Halal",
            "Silo Patio",
            "12am - 4pm",
            2
        ),
        Food(
            3,
            "Star Ginger",
            "Silo Patio ",
            "1pm - 4pm",
            3
        ),
        Food(
            4,
            "Bangin Bowls",
            "Tercero DC",
            "2pm - 6pm",
            4
        ),
        Food(
            5,
            "Hefty Gyros",
            "Storer Hall",
            "1pm - 4pm",
            5
        ),
    )
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val adapter=FoodListRecyclerViewAdapter(foods)
        val recyclerView =findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter=adapter
        recyclerView.layoutManager=LinearLayoutManager(this)
        /*
        binding=ActivityMainBinding.inflate(layoutInflater)
        var view =binding.root
        setContentView(R.layout.activity_main)
        */
    }
}