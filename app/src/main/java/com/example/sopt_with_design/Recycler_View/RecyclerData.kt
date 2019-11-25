package com.example.sopt_with_design.Recycler_View

import com.google.gson.annotations.SerializedName

data class GetData(
    @SerializedName("data")
    val data: List<RecyclerData>
)

data class RecyclerData (
    @SerializedName("image")
    var img : String,
    @SerializedName("region")
    var tvTitle : String,
    @SerializedName("createAt")
    var tvSubTitle : String
)