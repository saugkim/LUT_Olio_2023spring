package lut.weekly.chatbot;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

//https://medium.com/codex/how-to-build-a-messaging-ui-for-your-android-chat-app-883fad05f43a
public class MessageAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    List<Message> messageList;
    private static final int MY_MESSAGE_VIEW_TYPE = 0;
    private static final int BOT_MESSAGE_VIEW_TYPE = 1;

    public MessageAdapter(ArrayList<Message> list) {
        messageList = list;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        if (viewType == MY_MESSAGE_VIEW_TYPE) {
            view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.my_layout, parent, false);
            return new MyMessageViewHolder(view);
        } else {
            view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.bot_layout, parent, false);
            return new BotMessageViewHolder(view);
        }
    }

    @Override
    public int getItemViewType(int position) {
        Message message = messageList.get(position);

        if (message.getSender().getName().equals(User.ME.toString())){
            return MY_MESSAGE_VIEW_TYPE;
        } else {
            return BOT_MESSAGE_VIEW_TYPE;
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Message message = messageList.get(position);
        if (holder.getItemViewType() == MY_MESSAGE_VIEW_TYPE) {
            ((MyMessageViewHolder) holder).bind(message);
        } else {
            ((BotMessageViewHolder) holder).bind(message);
        }
    }

    @Override
    public int getItemCount() {
        return messageList.size();
    }
}
