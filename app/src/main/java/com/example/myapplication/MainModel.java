package com.example.myapplication;

public class MainModel {
    String Name;
    String email;

    MainModel() {

    }
    public MainModel(String name, String email, String image, String course) {
        Name = name;
        this.email = email;
        Image = image;
        Course = course;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public String getCourse() {
        return Course;
    }

    public void setCourse(String course) {
        Course = course;
    }

    String Image;
    String Course;
}
