package com.lut.student;

import android.util.Log;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;


public class UserAdapter extends RecyclerView.Adapter<UserViewHolder> {

    UserAdapter.MyCallBack myCallback;

    public interface MyCallBack{
        void listenerMethod();
    }

    ArrayList<User> users;
    public static final String TAG = "ZZ AdapterClass";

    public UserAdapter(ArrayList<User> users, MyCallBack myCallBack) {
        this.users = users;
        this.myCallback = myCallBack;
        Log.d(TAG, "UserAdapter constructor");
    }


    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return UserViewHolder.create(parent);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        User user = users.get(position);
        holder.bind(user);

    }

    @Override
    public int getItemCount() {
        return users.size();
    }
}
