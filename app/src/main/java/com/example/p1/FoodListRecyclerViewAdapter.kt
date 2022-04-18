package com.example.p1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FoodListRecyclerViewAdapter(private var foods:List<Food>):RecyclerView.Adapter<FoodListRecyclerViewAdapter.ViewHolder> (){
    class ViewHolder(itemView:View): RecyclerView.ViewHolder(itemView){
        val nameTextView: TextView=itemView.findViewById(R.id.FoodName)
        val locationTextView: TextView=itemView.findViewById(R.id.location)
        val timeTextView:TextView=itemView.findViewById(R.id.time)
        val imageView:ImageView=itemView.findViewById(R.id.foodImage)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view=LayoutInflater
            .from(parent.context)
            .inflate(R.layout.food_truck_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val food=foods[position]
        holder.apply {
            nameTextView.text=food.name
            locationTextView.text=food.location
            timeTextView.text=food.time
            imageView.setImageResource(
                when(food.image){
                    0->R.drawable.demo_1
                    1->R.drawable.demo_2
                    2->R.drawable.demo_3
                    3->R.drawable.demo_4
                    4->R.drawable.demo_5
                    5->R.drawable.demo_6
                    else->throw Exception("food.image must be between 0 to 5")
                }
            )
        }

    }

    override fun getItemCount(): Int {
        return foods.count()
    }
}