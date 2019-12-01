package com.example.sopt_with_design.Recycler_View

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.sopt_with_design.Data.recycler_data
import com.example.sopt_with_design.R

class RecyclerAdapter(var datas: List<recycler_data>) : RecyclerView.Adapter<RecyclerViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        val view: View = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.list_item_recycler, parent, false)


        return RecyclerViewHolder(view)
    }

    override fun getItemCount(): Int = datas.size

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {

        holder.bind(datas[position])

    }


}