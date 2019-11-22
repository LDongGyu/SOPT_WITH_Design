package com.example.sopt_with_design

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout.VERTICAL
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sopt_with_design.BnbList.BnbAdapter
import com.example.sopt_with_design.BnbList.GetBnbData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var bnbInfo : RecyclerView
    private lateinit var bnbAdapter: BnbAdapter
    private val getBnbData = GetBnbData()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()


        button1.setOnClickListener {
            var nextIntent = Intent(this, MessageActivity::class.java)
            startActivity(nextIntent)
        }
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