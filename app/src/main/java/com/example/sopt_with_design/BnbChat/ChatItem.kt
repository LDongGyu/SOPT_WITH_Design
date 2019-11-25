package com.example.sopt_with_design.BnbChat

import android.content.res.Resources
import com.google.gson.annotations.SerializedName

data class ChatItem(
    @SerializedName("image")
    val profile_img: String,
    @SerializedName("text")
    val content: String,
    @SerializedName("userName")
    val name: String?,
    @SerializedName("date")
    val date: String,
    val type: Int
)