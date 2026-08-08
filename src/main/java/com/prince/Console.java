package com.prince;

import java.util.*;
import java.util.regex.Pattern;

public class Console {

    private List<User> users;

    public Console(){
        this.users = new ArrayList<>();
    }

    public List<User> getUsers(){
        return Collections.unmodifiableList(users);
    }

    public boolean passwordValidator(String password){

        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[^a-zA-Z0-9]).{8,}$";
        return Pattern.matches(regex, password);
    }

    public String login(String UserName, String UserPassword){

        for(User user : users){
            if(user.getName().equalsIgnoreCase(UserName)){
                if(user.getPassword().equals(UserPassword)){
                    return "LOGGED IN SUCCESSFULLY!";
                }else{
                    return "INCORRECT PASSWORD!";
                }
            }
        }
        return "USER NOT FOUND!";
    }

    public String register(String userName, String userPassword){

        for(User user : users){
            if(user.getName().equalsIgnoreCase(userName)){
                return "USERNAME ALREADY EXISTS";
            }
        }
        if(passwordValidator(userPassword)){
            return "PASSWORD DENIED!\nPassword Structure:\n- Atleast 1 uppercase letter\n- Atleast 1 lowercase letter\n- More than 8 characters long\n- Atleast 1 number\n- Atleast 1 special character";
        }

        return "REGISTERED SUCCESSFULLY";
    }
}
