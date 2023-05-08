package lut.weekly.chatbot;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Date;

public class MyMessageViewHolder extends RecyclerView.ViewHolder {

    Message mMessage;
    TextView tvMessage, tvTimestamp;
    CardView cardView;
    Context context;

    public MyMessageViewHolder(@NonNull View itemView) {
        super(itemView);
        tvMessage = itemView.findViewById(R.id.text_message_me);
        tvTimestamp = itemView.findViewById(R.id.text_timestamp_me);
        cardView = itemView.findViewById(R.id.cardView_me);
        context = itemView.getContext();
    }

    public void bind(Message message){
        mMessage = message;
        tvMessage.setText(message.getMessage());
        tvTimestamp.setText("today");
        cardView.setCardBackgroundColor(context.getColor(R.color.card_background));
    }
}