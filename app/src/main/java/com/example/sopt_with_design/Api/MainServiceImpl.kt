package com.example.sopt_with_design.Api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object MainServiceImpl {
    private const val BASE_URL = "http://13.209.233.217:3000"

    private val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val service: MainService = retrofit.create(MainService::class.java)

}