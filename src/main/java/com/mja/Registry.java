package com.mja;

import java.util.HashMap;
import java.util.Map;

public class Registry {

    private UserBase userBase = UserBase.getInstance();
    private SingUp singUp = new SingUp(userBase);

    public void singUp(String login, String password, String name, String surname, int age){
        String message = singUp.addUser(login, password, name, surname, age);
        System.out.println(message);
    }

    public void printUserBase(){
        userBase.toString();
    }
}
