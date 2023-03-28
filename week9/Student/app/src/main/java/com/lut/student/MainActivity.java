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
            addSomeUsersForTest(NUMBER_OF_USER_FOR_TEST);
        }
        startActivity(new Intent(this, ListActivity.class));
    }

    public void addSomeUsersForTest(int n) {
        User u0 = new User("James","Adobe","adobe.james@lut.fi", getResources().getString(R.string.sahkotekniikka));
        User u1 = new User("Brian","Zombie","zomebie.brian@lut.fi", getResources().getString(R.string.laskennallinen_tekniikka));
        User u2 = new User("Susan","Gigachad","gigachad.susan@lut.fi", getResources().getString(R.string.tietotekniikka));
        User u3 = new User("Mikko","Azure","azure.mikko@lut.fi", getResources().getString(R.string.tuotantotalous));
        User u4 = new User("Maria","Bbc","bbc.maria@lut.fi", getResources().getString(R.string.sahkotekniikka));
        User u5 = new User("Jane","Alley","alley.jane@lut.fi", getResources().getString(R.string.sahkotekniikka));
        User u6 = new User("Amanda","Casino","casino.amanda@lut.fi", getResources().getString(R.string.sahkotekniikka));
        User u7 = new User("Kally","Terabit","terabit.kally@lut.fi", getResources().getString(R.string.sahkotekniikka));
        User u8 = new User("Pikachu","Eevee","eevee.pikachu@lut.fi", getResources().getString(R.string.sahkotekniikka));
        User u9 = new User("Mew","Turbo","turbo.mew@lut.fi", getResources().getString(R.string.sahkotekniikka));

        ArrayList<String> degrees = new ArrayList<>();
        degrees.add(getResources().getString(R.string.kandidaatin_tutkinto));
        degrees.add(getResources().getString(R.string.uimamaisteri));

        u0.setDegrees(degrees);
        u1.setDegrees(degrees);

        User[] users = new User[] { u0, u1, u2, u3, u4, u5, u6, u7, u8, u9 };
        for (int i = 0; i <n; i++) {
            UserStorage.getInstance().addUser(users[i]);
        }

        UserStorage.getInstance().saveUsersToFile(this);
    }
}