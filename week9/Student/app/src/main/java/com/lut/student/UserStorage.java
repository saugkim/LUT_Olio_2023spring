package com.lut.student;

import java.util.ArrayList;

public class UserStorage {

    ArrayList<User> users;
    private static UserStorage storage = null;

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
}
