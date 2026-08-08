package com.prince;

public class User {

    private String name;
    private String password;

    public User(String Username, String Userpassword){
        this.name = Username;
        this.password  = Userpassword;
    }

    public String getPassword(){
        return password;
    }
    public String getName(){
        return name;
    }
}
