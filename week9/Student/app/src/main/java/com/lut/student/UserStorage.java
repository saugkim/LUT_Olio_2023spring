package com.lut.student;

import android.content.Context;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class UserStorage {

    ArrayList<User> users;
    private static UserStorage storage = null;
    public static String FILE_NAME = "user_database.data";

    private UserStorage() {
        users = new ArrayList<User>();
    }

    public static UserStorage getInstance() {
        if (storage == null) {
            storage = new UserStorage();
        }
        return storage;
    }


    public ArrayList<User> getUsers() {
        return users;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    public void removeUser(int id) {
        users.remove(id);
    }

    public void saveUsersToFile(Context context) {
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(context.openFileOutput(FILE_NAME, Context.MODE_PRIVATE));
            objectOutputStream.writeObject(users);
            objectOutputStream.close();
        } catch (IOException e) {
            System.out.println("Saving users failed");
        }
    }

    public void loadDataFromFile(Context context) {
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(context.openFileInput(FILE_NAME));
            users = (ArrayList<User>) objectInputStream.readObject();
            objectInputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("Loading failed: file not found");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Loading failed: IO exception");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Loading from file failed: User class not found");
            e.printStackTrace();
        }
    }
}
