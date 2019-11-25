package com.example.sopt_with_design.api

import com.example.sopt_with_design.BnbChat.ChatData
import com.example.sopt_with_design.BnbChat.ChatItem
import com.example.sopt_with_design.Recycler_View.GetData
import com.example.sopt_with_design.Recycler_View.RecyclerData
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface ChatService{

    @GET("/main/hotel/users/{userIdx}")
    fun getHotelList(
        @Path("userIdx") userIdx: Int
    ): Call<GetData>

    @GET("/main/play/users/{userIdx}")
    fun getPlayList(
        @Path("userIdx") userIdx: Int
    ): Call<List<RecyclerData>>

    @GET("/main/adventure/users/{userIdx}")
    fun getAdventureList(
        @Path("userIdx") userIdx: Int
    ): Call<List<RecyclerData>>

    @GET("/main/food/users/{userIdx}")
    fun getFoodList(
        @Path("userIdx") userIdx: Int
    ): Call<List<RecyclerData>>

    @POST("/chat")
    fun getChatList(): Call<ChatData>
}