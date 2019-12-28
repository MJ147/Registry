package com.mja.service;

import com.mja.database.UserBase;
import com.mja.model.User;

public class UserService {

    private UserBase userBase;

    public UserService(UserBase userBase) {
        this.userBase = userBase;
    }

    public String addUser(String login, String password, String name, String surname, int age) {
        String message = verifyLoginAndPassword(login, password);
        if (message.equals("Login and password are correct")) {
            User user = new User(login, password, name, surname, age);
            userBase.getUserMap().put(login, user);
        }
        return message;
    }

    public String verifyLoginAndPassword(String login, String password) {

        if (isLoginInDatabase(login)) {
            return "User name is already exist";
        }
        if (login.equals("")) {
            return "User name can not be empty";
        }
        if (password.equals("")) {
            return "Password can not be empty";
        }
        if (login.equals(password)) {
            return "Login and password can not be the same";
        }
        if (password.length() <= 7) {
            return "Password length has to be longer then 7 chars";
        }
        if (!password.matches(".*[A-Z].*")) {
            return "Password must has one big letter";
        }
        if (!password.matches(".*\\d.*")) {
            return "Password must has one number";
        }
        return "Login and password are correct";
    }

    public boolean isLoginInDatabase(String login) {
        boolean isLoginInDatabase = false;
        if (userBase.getUserMap().containsKey(login)) {
            isLoginInDatabase = true;
        }
        return isLoginInDatabase;
    }

    public String loginUser(String login, String password) {
        if (!isLoginInDatabase(login)) {
            return "User" + login + "does not exist";
        }
        if (!isCorrectPassword(login, password)) {
            return "Incorrect password";
        }
        userBase.getUserMap().get(login).setSignIn(true);
        return "Login successful";
    }

    public boolean isCorrectPassword(String login, String password) {
        boolean isCorrectPassword = false;
        if (userBase.getUserMap().get(login).getPassword() == password) {
            isCorrectPassword = true;
        }
        return isCorrectPassword;
    }

}
