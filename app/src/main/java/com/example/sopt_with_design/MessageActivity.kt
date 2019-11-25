package com.example.sopt_with_design

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sopt_with_design.BnbChat.ChatAdapter
import com.example.sopt_with_design.BnbChat.ChatData
import com.example.sopt_with_design.BnbChat.ChatItem
import com.example.sopt_with_design.api.ChatServiceImpl
import kotlinx.android.synthetic.main.activity_message.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MessageActivity : AppCompatActivity() {

    private lateinit var chatList: RecyclerView
    private lateinit var chatListAdapter: ChatAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_message)

        initChatList()
        back_img.setOnClickListener {
            finish()
        }

        send_btn.setOnClickListener {
            var newChat = ChatItem(
                    profile_img = R.drawable.blank,
                    content = textMsg_edit.text.toString(),
                    name = "",
                    date = "Oct 10",
                    type = 0
            )
            chatListAdapter.data.add(newChat)
            chatListAdapter.notifyDataSetChanged()
            chatList.scrollToPosition(chatListAdapter.itemCount-1)
        }
    }

    private fun initChatList(){
        chatList = findViewById(R.id.chat_list)
        chatListAdapter = ChatAdapter(this)
        chatList.adapter = chatListAdapter
        chatList.layoutManager = LinearLayoutManager(this)
        chatList.height

        val call: Call<ChatData> = ChatServiceImpl.service.getChatList()
        call.enqueue(
            object : Callback<ChatData>{
                override fun onFailure(call: Call<ChatData>, t: Throwable) {
                    Log.e("sopt_with_design","error : $t")
                }

                override fun onResponse(
                    call: Call<ChatData>,
                    response: Response<ChatData>
                ) {
                    if(response.isSuccessful){
                        val charlist = response.body()!!
                        
                        chatListAdapter.data = charlist.data as MutableList<ChatItem>
                        chatListAdapter.notifyDataSetChanged()
                    }
                }
            }
        )
        chatListAdapter.notifyDataSetChanged()


//        chatListAdapter.data = mutableListOf(
//            ChatItem(
//                profile_img = R.drawable.blank,
//                content = "제가 보낸 겁니당",
//                name = "",
//                date = "Oct 10",
//                type = 0
//            ),
//            ChatItem(
//                profile_img = R.drawable.profile_bella,
//                content = "취업 시켜주세요",
//                name = "Bella Jane",
//                date = "Oct 10",
//                type = 1
//            )
//        )
    }
}