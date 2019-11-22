package com.example.sopt_with_design

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.LinearLayout.VERTICAL
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var bnbInfo : RecyclerView
    private lateinit var bnbAdapter: BnbAdapter
    private val getBnbData = GetBnbData()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }

    @SuppressLint("WrongConstant")
    private fun init(){
        bnbInfo = findViewById(R.id.bnbInfo)

        bnbAdapter = BnbAdapter(this)

        bnbInfo.adapter = bnbAdapter

        bnbInfo.layoutManager = LinearLayoutManager(this, VERTICAL, false)

        bnbAdapter.data = getBnbData.getBnbList()

        bnbAdapter.notifyDataSetChanged()
    }
}