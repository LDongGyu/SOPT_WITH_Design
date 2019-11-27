package com.example.sopt_with_design.Api

import com.example.sopt_with_design.Data.MainData
import com.example.sopt_with_design.Recycler_View.RecyclerData
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path


interface MainService {
    @GET(" /main/hotel/users/{userIdx}")
    fun getHotelDataList(
        @Path("userIndx") userIdx : String

    ): Call<MainData>

    @GET("/main/play/users/{userIdx}")
    fun getPlayDataList(
        @Path ("userIndx") userIdx: String

    ) :Call<MainData>

    @GET("/main/adventure/users/{userIdx}")
    fun getAdventureDataList(
        @Path("userIndx") userIdx: String
    ): Call<MainData>

    @GET("/main/food/users/userIdx")
    fun getFoodDataList(
      //  @Path("userIndx") userIdx : String
    ): Call<MainData>


}