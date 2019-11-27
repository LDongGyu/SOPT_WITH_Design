package com.example.sopt_with_design.Data

import com.google.gson.annotations.SerializedName


data class MainData (

    @SerializedName("status")
    val status : Int,
    @SerializedName("success")
    val success : Boolean,
    @SerializedName("message")
    val message: String?,
    @SerializedName( "data")
    val data : List<recycler_data>

)

data class recycler_data
    (
    @SerializedName("hotelIdx")
    val hotelIdx : Int,
    @SerializedName("region")
    val region : String?,
    @SerializedName("image")
    val image: String?,
    @SerializedName( "creditAt")
    val creditAt : String?

)