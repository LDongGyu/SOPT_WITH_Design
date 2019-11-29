package com.example.sopt_with_design.Api

import com.example.sopt_with_design.Data.MainData
import com.example.sopt_with_design.Recycler_View.RecyclerData
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path


interface MainService {
    @GET(" /main/hotel/users/{userIdx}")
    fun getHotelDataList(
        @Path("userIdx") userIdx : String

    ): Call<MainData>


}