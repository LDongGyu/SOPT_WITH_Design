package com.example.sopt_with_design

class GetBnbData {
    fun getBnbList() : List<BnbItem>{
        return listOf(
            BnbItem(
                name = "파리",
                date = "10월 25일 - 31일"
            )
        )
    }
}