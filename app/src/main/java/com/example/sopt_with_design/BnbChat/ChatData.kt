package com.example.sopt_with_design.BnbChat

import com.google.gson.annotations.SerializedName

data class ChatData (
    @SerializedName("data")
    var data: List<ChatItem>
)