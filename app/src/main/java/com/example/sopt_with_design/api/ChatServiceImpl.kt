package com.example.sopt_with_design.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ChatServiceImpl{
    private const val BASE_URL = "https://"

    private val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create())
        .build()

    val service: ChatService = retrofit.create(
        ChatService::class.java)
}