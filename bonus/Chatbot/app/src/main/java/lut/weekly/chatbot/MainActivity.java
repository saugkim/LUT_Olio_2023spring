package lut.weekly.chatbot;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
//https://medium.com/codex/how-to-build-a-messaging-ui-for-your-android-chat-app-883fad05f43a

    private static Sender[] BOTS;
    ArrayList<Message> messages;
    EditText etMessage;
    Button buttonSend;
    MessageAdapter adapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        etMessage = findViewById(R.id.edit_chat_message);
        buttonSend = findViewById(R.id.button_send);

        messages = new ArrayList<>();
        Sender Bot1 = new Sender(User.BOT1.toString(), 0xFFFF0000);
        Sender Bot2 = new Sender(User.BOT2.toString(), 0xFF00FF00);
        Sender Bot3 = new Sender(User.BOT3.toString(), 0xFFFFFF00);
        Sender Bot4 = new Sender(User.BOT4.toString(), 0xFF00FFFF);
        Sender Bot5 = new Sender(User.BOT5.toString(), 0xFF0000FF);
        Sender Bot6 = new Sender(User.BOT6.toString(), 0xFFFF00FF);
        BOTS = new Sender[] { Bot1, Bot2, Bot3, Bot4, Bot5, Bot6 };

        addSome();

//        prepareView();
//        adapter = new MessageAdapter(messages);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//        recyclerView.setAdapter(adapter);

        buttonSend.setOnClickListener(v->{
            addMessage();
        });
    }

    private void prepareView() {
        adapter = new MessageAdapter(messages);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

        int lastIndex = messages.size()-1;
        recyclerView.smoothScrollToPosition(lastIndex);
    }

    @Override
    protected void onStart() {
        super.onStart();

        prepareView();
    }

    private void addMessage() {
        String msg = etMessage.getText().toString();

        if (msg.isEmpty()) {
            return;
        }

        Sender me = new Sender(User.ME.toString(), 0xffffff);
        Message newMessage = new Message(me, msg);
        messages.add(newMessage);
        int justAdded = messages.size() - 1;
        int position = messages.indexOf(newMessage);
        Log.d("ZZ at main", "last index: " + justAdded + ", position: " + position);

        adapter.notifyItemInserted(justAdded);
        recyclerView.smoothScrollToPosition(justAdded);
//        modelclass.add(index, values);
//        adapter.notifyItemInserted(index);
//        recyclerview.smoothScrollToPosition(index);
    }

    private void addSome() {
        Message me = new Message(new Sender(User.ME.toString(), 0xffffff),"first message");
        messages.add(me);
        for (int i = 0 ; i < BOTS.length ; i++){
            Message m = new Message(BOTS[i], "I am bot " + i);
            messages.add(m);
        }
    }
}