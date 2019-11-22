package com.example.sopt_with_design.BnbChat

import android.content.res.Resources

data class ChatItem(
    val profile_img: Int,
    val content: String,
    val name: String?,
    val date: String,
    val type: Int
)