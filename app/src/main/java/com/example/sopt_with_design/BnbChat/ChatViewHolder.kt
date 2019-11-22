package com.example.sopt_with_design.BnbChat

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.sopt_with_design.R
import kotlinx.android.synthetic.main.list_chat_item.view.*

class ChatViewHolder(view : View) : RecyclerView.ViewHolder(view){

    val profile_img: ImageView = view.findViewById(R.id.profile_img)
    val text_lay: ConstraintLayout = view.findViewById(R.id.text_lay)
    val chat_content_txt: TextView = view.findViewById(R.id.chat_content_txt)
    val chat_name_txt: TextView = view.findViewById(R.id.chat_name_txt)
    val chat_date_txt: TextView = view.findViewById(R.id.chat_date_txt)

    fun bind(data: ChatItem){
        profile_img.setImageResource(data.profile_img)
        if (data.type == 0) {// 내가 보낸거
            text_lay.setBackgroundColor(0xEEF4F4)
        }
        else{
            text_lay.setBackgroundColor(0xF88F8F)
        }
        chat_content_txt.text = data.content
        chat_name_txt.text = data.name
        chat_date_txt.text = data.date
    }
}