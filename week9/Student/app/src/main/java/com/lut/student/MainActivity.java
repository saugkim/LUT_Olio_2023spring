package com.lut.student;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    final static String TAG = "ZZ MainActivity";
    public static int NUMBER_OF_USER_FOR_TEST = 4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UserStorage.getInstance().loadUsersFromFile(this);
    }

    public void moveToAddView(View view) {
        startActivity(new Intent(this, AddActivity.class));
    }

    public void moveToListView(View view) {
        if (UserStorage.getInstance().getUsers().size() == 0) {
            addUsersForTest(NUMBER_OF_USER_FOR_TEST);
        }
        startActivity(new Intent(this, ListActivity.class));
    }

    public void addUsersForTest(int n) {
        User u0 = new User("James","Abcde","firstname.lastname@lut.fi","GOOD PROGRAM");
        User u1 = new User("Brian","Zombie","firstname.lastname@lut.fi","GOOD PROGRAM");
        User u2 = new User("Susan","Gigachad","firstname.lastname@lut.fi","GOOD PROGRAM");
        User u3 = new User("Mikko","Azure","firstname.lastname@lut.fi","GOOD PROGRAM");
        User u4 = new User("Maria","Bbc","firstname.lastname@lut.fi","GOOD PROGRAM");
        User u5 = new User("Jane","Alley","firstname.lastname@lut.fi","GOOD PROGRAM");
        User u6 = new User("Amanda","Casino","firstname.lastname@lut.fi","GOOD PROGRAM");
        User u7 = new User("Kally","Terabit","firstname.lastname@lut.fi","GOOD PROGRAM");
        User u8 = new User("Pikachu","Eevee","firstname.lastname@lut.fi","GOOD PROGRAM");
        User u9 = new User("Mew","Turbo","firstname.lastname@lut.fi","GOOD PROGRAM");

        ArrayList<String> degrees = new ArrayList<>();
        degrees.add(AddActivity.DEGREES[0]);
        degrees.add(AddActivity.DEGREES[3]);

        u0.setDegrees(degrees);
        u1.setDegrees(degrees);

        User[] users = new User[] { u0, u1, u2, u3, u4, u5, u6, u7, u8, u9 };
        for (int i = 0; i <n; i++) {
            UserStorage.getInstance().addUser(users[i]);
        }
    }
}