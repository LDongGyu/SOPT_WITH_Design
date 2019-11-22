package com.example.sopt_with_design

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.TextView
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.sopt_with_design.Recycler_View.RecyclerAdapter
import com.example.sopt_with_design.Recycler_View.RecyclerData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(){

    lateinit var recyclerAdapter: RecyclerAdapter
    lateinit var datas : List<com.example.sopt_with_design.Recycler_View.RecyclerData>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        datas = listOf(RecyclerData(R.drawable.img_nice,"니스(Nice)","10월 22일 ~ 24일"),
            RecyclerData(R.drawable.img_paris,"파리","10월 25일 ~ 31일"),
            RecyclerData(R.drawable.img_london,"런던","11월 1일 ~ 6일")
           )

        recyclerAdapter = RecyclerAdapter(datas)
        rv_list.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)
        rv_list.adapter = recyclerAdapter

    }
}