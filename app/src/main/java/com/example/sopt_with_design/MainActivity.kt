package com.example.sopt_with_design


import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.sopt_with_design.Api.MainServiceImpl
import com.example.sopt_with_design.Data.MainData
import com.example.sopt_with_design.Data.recycler_data
import com.example.sopt_with_design.Recycler_View.RecyclerAdapter
import com.example.sopt_with_design.Recycler_View.RecyclerData
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity(){



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        var bottomNavigation: BottomNavigationView = findViewById(R.id.bottomNavigationView_main_menu)

        bottomNavigation.setOnNavigationItemSelectedListener{
            onOptionsItemSelected(it)
        }

        val call: Call<MainData> = MainServiceImpl.service.getHotelDataList("1")

        call.enqueue(
            //Callback 익명 클래스 선언
            object : Callback<MainData> {
                // 네트워크 통신이 실패하면 호출
                override fun onFailure(call: Call<MainData>, t: Throwable) {
                    Log.e("main_data","errer : $t")
                }


                // 네트워크 통신이 성공하면 호출
                override fun onResponse(call: Call<MainData>, response: Response<MainData>) {
                    if(response.isSuccessful)
                    {
                        lateinit var recyclerAdapter: RecyclerAdapter
                        var datas = response.body()!!.data

                        recyclerAdapter = RecyclerAdapter(datas)
                        rv_list.layoutManager = LinearLayoutManager(this@MainActivity, LinearLayoutManager.HORIZONTAL,false)
                        rv_list.adapter = recyclerAdapter


                    }
                }

            }
        )

        getData()

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == R.id.menu_message){
            var intent = Intent(this,MessageActivity::class.java)
            startActivity(intent)
        }
        return true
    }


  fun getData(){


}

}