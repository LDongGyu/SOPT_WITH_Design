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
    @POST("/chat")
    fun getChatList(): Call<ChatData>
}