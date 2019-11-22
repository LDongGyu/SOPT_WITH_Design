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
                profile_img = R.drawable.blank,
                content = "길게도 써보고 짧게도 써보고 무슨 말을 써야할지는 모르겠지만 대충 테스트 중이라는 이야기입니다. 날씨가 너무 춥네요. 따끈한 탕에 소주 한 잔 좋을거 같네요.",
                name = "",
                date = "Oct 10",
                type = 0
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
                content = "최강 합세 5조 화이팅",
                name = "",
                date = "Oct 10",
                type = 0
            )
        )

        chatListAdapter.notifyDataSetChanged()
    }
}
