package lut.weekly.chatbot;

import androidx.annotation.NonNull;

import java.util.Locale;

public class Message {
    private Sender sender;
    private String message;
    private String createdAt;

    public Message(){

    }

    public Message(Sender sender, String message) {
        this.sender = sender;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public Sender getSender() {
        return sender;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setSender(Sender sender) {
        this.sender = sender;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    @NonNull
    public String toString(){
        return String.format(Locale.getDefault(), "%s",getMessage());
    }
}
