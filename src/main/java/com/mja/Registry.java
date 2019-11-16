package com.mja;

import com.mja.model.User;

import java.util.Map;

public class Registry {

    private UserBase userBase = UserBase.getInstance();
    private SignUp signUp = new SignUp(userBase);

    public void signUp(String login, String password, String name, String surname, int age){
        String message = signUp.addUser(login, password, name, surname, age);
        System.out.println(message);
    }

    public Map<String, User> getUserBase() {
        return userBase.getUserMap();
    }

    public void printUserBase(){
        System.out.println(userBase.toString());
    }
}
