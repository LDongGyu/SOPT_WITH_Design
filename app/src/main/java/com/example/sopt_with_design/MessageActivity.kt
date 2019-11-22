package com.example.sopt_with_design

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sopt_with_design.BnbChat.ChatAdapter
import com.example.sopt_with_design.BnbChat.ChatItem

class MessageActivity : AppCompatActivity() {

    private lateinit var chatList: RecyclerView
    private lateinit var chatListAdapter: ChatAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_message)

        initChatList()
    }

    private fun initChatList(){
        chatList = findViewById(R.id.chat_list)
        chatListAdapter = ChatAdapter(this)
        chatList.adapter = chatListAdapter
        chatList.layoutManager = LinearLayoutManager(this)
        chatList.height

        chatListAdapter.data = listOf(
            ChatItem(
                profile_img = R.drawable.blank,
                content = "제가 보낸 겁니당",
                name = "",
                date = "Oct 10",
                type = 0
            ),
            ChatItem(
                profile_img = R.drawable.profile_bella,
                content = "벨라 껍니다ㅏㅏㅏ",
                name = "Bella Jane",
                date = "Oct 10",
                type = 1
            ),
            ChatItem(
                profile_img = R.drawable.profile_bella,
                content = "벨라는 수다쟁이입니다",
                name = "Bella Jane",
                date = "Oct 10",
                type = 1
            ),
            ChatItem(
                profile_img = R.drawable.profile_bella,
                content = "벨라 껍니다ㅏㅏㅏ",
                name = "Bella Jane",
                date = "Oct 10",
                type = 1
            ),
            ChatItem(
                profile_img = R.drawable.profile_bella,
                content = "벨라는 수다쟁이입니다",
                name = "Bella Jane",
                date = "Oct 10",
                type = 1
            ),
            ChatItem(
                profile_img = R.drawable.profile_bella,
                content = "벨라 껍니다ㅏㅏㅏ",
                name = "Bella Jane",
                date = "Oct 10",
                type = 1
            ),
            ChatItem(
                profile_img = R.drawable.profile_bella,
                content = "벨라는 수다쟁이입니다",
                name = "Bella Jane",
                date = "Oct 10",
                type = 1
            ),
            ChatItem(
                profile_img = R.drawable.profile_bella,
                content = "벨라 껍니다ㅏㅏㅏ",
                name = "Bella Jane",
                date = "Oct 10",
                type = 1
            ),
            ChatItem(
                profile_img = R.drawable.profile_bella,
                content = "벨라는 수다쟁이입니다",
                name = "Bella Jane",
                date = "Oct 10",
                type = 1
            ),
            ChatItem(
                profile_img = R.drawable.profile_bella,
                content = "취업 시켜주세요",
                name = "Bella Jane",
                date = "Oct 10",
                type = 1
            ),
            ChatItem(
                profile_img = R.drawable.blank,
                content = "5조합세 나이스",
                name = "",
                date = "Oct 10",
                type = 0
            )
        )

        chatListAdapter.notifyDataSetChanged()
    }
}
