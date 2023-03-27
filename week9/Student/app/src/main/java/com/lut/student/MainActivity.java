package com.lut.student;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    final static String TAG = "ZZ MainActivity";
    public static int TEST_NUMBER_OF_USER = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UserStorage.getInstance().loadDataFromFile(this);
    }

    public void moveToAddView(View view) {
        startActivity(new Intent(this, AddActivity.class));
    }

    public void moveToListView(View view) {
        if (UserStorage.getInstance().getUsers().size() == 0) {
            addUsersForTest(TEST_NUMBER_OF_USER);
        }
        startActivity(new Intent(this, ListActivity.class));
    }

    public void addUsersForTest(int n) {
        User user = new User("Firstname","Lastname","firstname.lastname@lut.fi","GOOD PROGRAM");

        for (int i=0;i<n;i++) {
            UserStorage.getInstance().addUser(user);
        }
    }
}