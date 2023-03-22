package com.lut.student;

import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UserViewHolder extends RecyclerView.ViewHolder {

    public final static String TAG = "ZZ UserViewHolder";
    TextView textView;
    ImageView imageView;
    UserStorage storage = UserStorage.getInstance();
    User currentUser;

    public UserViewHolder(@NonNull View itemView) {
        super(itemView);

        textView = itemView.findViewById(R.id.itemText);
        imageView = itemView.findViewById(R.id.itemImage);

        itemView.setOnLongClickListener(v -> {
           storage.removeUser(currentUser);
           return true;
        });
    }

    public void bind(User user) {
        currentUser = user;
        textView.setText(user.toString());
        Log.i(TAG, "image uri: " + user.getImageName());

        if (user.getImageName() != null)
            imageView.setImageURI(Uri.parse(user.getImageName()));
    }

    static UserViewHolder create(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_view, parent, false);
        return new UserViewHolder(view);
    }
}
