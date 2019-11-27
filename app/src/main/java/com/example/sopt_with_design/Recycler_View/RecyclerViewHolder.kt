package com.example.sopt_with_design.Recycler_View

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.sopt_with_design.Data.recycler_data
import com.example.sopt_with_design.R

class RecyclerViewHolder (itemView : View) : RecyclerView.ViewHolder (itemView){

    val  recyclerItemTitle : TextView = itemView.findViewById(R.id.txt_title_name)
    val recycelerItemSubTitle : TextView = itemView.findViewById(R.id.txt_subtitle_name)
    val recyclerItemImg : ImageView = itemView.findViewById(R.id.img_view)

    fun bind(data : recycler_data)
    {
        recyclerItemTitle.text = data.region
        recycelerItemSubTitle.text = data.creditAt
        Glide.with(itemView)
            .load(data.image)
            .into(recyclerItemImg)



    }
}