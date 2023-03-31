package com.lut.student;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;


public class UserListAdapter extends ListAdapter<User, UserViewHolder> {


    static final String TAG = "ZZ UserListAdapter";

    Context context;
    public UserListAdapter(@NonNull DiffUtil.ItemCallback<User> diffCallback, Context context) {
        super(diffCallback);
        this.context = context;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return UserViewHolder.create(parent);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        User user = getItem(position);
        Log.d(TAG, "User adapter onBindViewHolder");
        int userIndex = UserStorage.getInstance().getUsers().indexOf(user);
        Log.d(TAG, "user index is " + userIndex + " position: " + position);
//        holder.textView.setOnClickListener(v -> {
//            Log.d(TAG, "holder textView on click");
//            Log.d(TAG, "position of click " + position);
//        });
        holder.bind(user);
    }

    static class ItemDiff extends DiffUtil.ItemCallback<User> {
        @Override
        public boolean areItemsTheSame(@NonNull User oldItem, @NonNull User newItem) {
            return oldItem.equals(newItem);
        }

        @Override
        public boolean areContentsTheSame(@NonNull User oldItem, @NonNull User newItem) {
            return oldItem.getEmail().equals(newItem.getEmail());
        }
    }
}

