package com.example.myapplication.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Random;


public class UserData {
    private String id;
    private String name;
    private String username;
    private String mail;
    private String password;

    class User {
        @SerializedName("login")
        @Expose
        String login;
        @SerializedName("id")
        @Expose
        int id;
        @SerializedName("avatar_url")
        @Expose
        String avatar_url;




    @SerializedName("avatar_url")
    @Expose
    String avatar_url;

    public UserData(String name, String username, String mail, String password) {
        this.login = login;
        this.name = name;
        this.username = username;
        this.mail = mail;
        this.password = password;
        Random rand = new Random();
        int upperbound = 1000000;
        //generate random values from 0-24
        int idr = rand.nextInt(upperbound);
        this.id= Integer.toString(idr);
        this.avatar_url = avatar_url;

    }

    public UserData(){

    }

    public void setId(String id) {
        this.id = id;
    }
    public String getId() {return id;}

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getMail() {
        return mail;
    }

    public String getPass() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setPass(String password) {
        this.password = password;
    }

    public String getLogin()
    {
            return login;
        }

        public void setLogin(String login) {
            this.login = login;
        }
        public String getAvatar_url() {
            return avatar_url;
        }

        public void setAvatar_url(String avatar_url) {
            this.avatar_url = avatar_url;
        }

        public String toString() {
            return(login);
        }

}

