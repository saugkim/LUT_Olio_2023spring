package com.lut.student;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Comparator;
import java.util.List;

public class ListActivity extends AppCompatActivity {

    TextView textView;
    UserStorage storage = UserStorage.getInstance();
    RecyclerView recyclerView;
    UserListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        textView = findViewById(R.id.userInfo);
        textView.setText(String.format("Number of users: %s", storage.getUsers().size()));

        recyclerView = findViewById(R.id.recycler_view);

        adapter = new UserListAdapter(new UserListAdapter.ItemDiff(), this);
        List<User> sorted = storage.getUsers();

        Comparator<User> userComparator = Comparator.comparing(User::getLastName)
                                    .thenComparing(User::getFirstName)
                                    .thenComparing(User::getDegreeProgram);
        sorted.sort(userComparator);

        adapter.submitList(sorted);
        //List<User> test = storage.getUsers();
        //adapter.submitList(test);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}