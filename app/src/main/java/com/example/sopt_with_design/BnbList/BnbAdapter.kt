package com.example.sopt_with_design.BnbList

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.sopt_with_design.R

class BnbAdapter (private val context: Context) : RecyclerView.Adapter<BnbViewHolder>(){

    var data = listOf<BnbItem>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BnbViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.rv_paris,parent,false)
        return BnbViewHolder(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: BnbViewHolder, position: Int) {
        holder.bind(data[position])
    }
}