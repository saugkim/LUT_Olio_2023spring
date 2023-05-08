package lut.weekly.chatbot;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class BotMessageViewHolder extends RecyclerView.ViewHolder {

    Message mMessage;
    TextView tvUser, tvMessage, tvTimestamp;
    CardView cardView;

    public BotMessageViewHolder(@NonNull View itemView) {
        super(itemView);
        tvUser = itemView.findViewById(R.id.text_user_bot);
        tvMessage = itemView.findViewById(R.id.text_message_bot);
        tvTimestamp = itemView.findViewById(R.id.text_timestamp_bot);
        cardView = itemView.findViewById(R.id.cardView_bot);
    }

    public void bind(Message message){
        mMessage = message;

        tvMessage.setText("Im a bot");
        tvUser.setText(message.getSender().getName());
        tvTimestamp.setText("right now");
        cardView.setCardBackgroundColor(message.getSender().getColor());
    }
}
