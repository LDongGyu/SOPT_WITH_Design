package com.example.sopt_with_design.BnbChat

import android.graphics.Color
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.marginLeft
import androidx.core.view.marginRight
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.sopt_with_design.R
import kotlinx.android.synthetic.main.list_chat_item.view.*

class ChatViewHolder(view : View) : RecyclerView.ViewHolder(view){

    val profile_img: ImageView = view.findViewById(R.id.profile_img)
    val text_lay: ConstraintLayout = view.findViewById(R.id.text_lay)
    val chat_content_txt: TextView = view.findViewById(R.id.chat_content_txt)
    val chat_name_txt: TextView = view.findViewById(R.id.chat_name_txt)
    val chat_date_txt: TextView = view.findViewById(R.id.chat_date_txt)

    fun bind(data: ChatItem){
        if (data.type == 0) {// 내가 보낸거
            profile_img.setImageResource(R.drawable.blank)
            text_lay.setBackgroundResource(R.drawable.my_bln)
            chat_content_txt.setTextColor(Color.parseColor("#FFFFFF"))
            chat_date_txt.setTextColor(Color.parseColor("#FFFFFF"))
        }
        else{
            Glide.with(itemView).load(data.profile_img).into(profile_img)
            text_lay.setBackgroundResource(R.drawable.other_bln)
            chat_content_txt.setTextColor(Color.parseColor("#1C1C1C"))
            chat_date_txt.setTextColor(Color.parseColor("#808080"))
            chat_name_txt.setTextColor(Color.parseColor("#808080"))
        }
        chat_content_txt.text = data.content
        chat_name_txt.text = data.name
        chat_date_txt.text = data.date
    }
}