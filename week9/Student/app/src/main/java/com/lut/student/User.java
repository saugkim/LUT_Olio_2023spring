package com.lut.student;

import android.net.Uri;

import androidx.annotation.NonNull;

public class User {
    String firstName;
    String lastName;
    String email;
    String degreeProgram;
    String imageName;

    public User(String firstName, String lastName, String email, String program) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        degreeProgram = program;
    }

    public void setImageName(String name){
        imageName = name;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getEmail() {
        return email;
    }
    public String getDegreeProgram() {
        return degreeProgram;
    }
    public String getImageName() { return imageName; }

    @NonNull
    @Override
    public String toString() {
        return String.format("%s %s\n\n%s\n%s", firstName, lastName, degreeProgram, email);
    }
}
