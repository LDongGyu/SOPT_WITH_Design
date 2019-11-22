package com.example.sopt_with_design.BnbList

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.sopt_with_design.R

class BnbViewHolder (view : View) : RecyclerView.ViewHolder(view){
    val ctnBnb : View = view.findViewById(R.id.ctnBnb)
    val imgNation : ImageView = view.findViewById(R.id.imgNation)
    val txtName : TextView = view.findViewById(R.id.txtName)
    val txtDate : TextView = view.findViewById(R.id.txtDate)

    fun bind(data : BnbItem){
        txtName.text = data.name
        txtDate.text = data.date
    }
}