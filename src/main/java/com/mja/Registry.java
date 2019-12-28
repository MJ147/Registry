package com.mja;

import com.mja.database.UserBase;
import com.mja.model.User;
import com.mja.service.UserService;

import java.util.Map;

public class Registry {

    private UserBase userBase;
    private UserService userService;

    public Registry() {
        this.userBase = new UserBase();
        this.userService = new UserService(userBase);
    }

    public void signUp(String login, String password, String name, String surname, int age){
        String message = userService.addUser(login, password, name, surname, age);
        System.out.println(message);
    }

    public void signIn(String login, String password) {
        String message = userService.loginUser(login, password);
        System.out.println(message);
    }

    public Map<String, User> getUserBase() {
        return userBase.getUserMap();
    }

    public void printUserBase(){
        System.out.println(userBase.toString());
    }
}
