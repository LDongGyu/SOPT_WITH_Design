package com.example.sopt_with_design


import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.sopt_with_design.Recycler_View.RecyclerAdapter
import com.example.sopt_with_design.Recycler_View.RecyclerData
import com.google.android.material.bottomnavigation.BottomNavigationView
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

        var bottomNavigation: BottomNavigationView = findViewById(R.id.bottomNavigationView_main_menu)

        bottomNavigation.setOnNavigationItemSelectedListener{
            onOptionsItemSelected(it)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == R.id.menu_message){
            var intent = Intent(this,MessageActivity::class.java)
            startActivity(intent)
        }
        return true
    }


}