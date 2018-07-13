package com.zipteam;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;

    private String name;
    private String email;
    private String password;
    private String picture;

    public User(){ }

    public User(String name, String email, String password){
        this.name = name;
        this.email = email;
        this.password = password;
    }

//    public User(int userId, String name, String email, String password){
//        this.userId = userId;
//        this.name = name;
//        this.email = email;
//        this.password = password;
//    }
//
//    public User(int userId, String name, String email, String password, String picture){
//        this.userId = userId;
//        this.name = name;
//        this.email = email;
//        this.password = password;
//        this.picture = picture;
//    }


    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getPicture() {
        return picture;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + userId +
                ", name='" + name + '\'' +
                '}';
    }


}
