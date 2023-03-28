package com.lut.student;

import android.net.Uri;

import androidx.annotation.NonNull;

import java.io.Serializable;
import java.util.ArrayList;

public class User implements Serializable {
    String firstName;
    String lastName;
    String email;
    String degreeProgram;
    String imageName;

    ArrayList<String> degrees;

    public User(String firstName, String lastName, String email, String program) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        degreeProgram = program;
        degrees = new ArrayList<>();
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

    public void setDegrees(ArrayList<String> degrees) {
        this.degrees = degrees;
    }
    public ArrayList<String> getDegrees(){
        return degrees;
    }

    @NonNull
    @Override
    public String toString() {
        return String.format("%s %s\n\n%s\n%s", firstName, lastName, degreeProgram, email);
    }
}
