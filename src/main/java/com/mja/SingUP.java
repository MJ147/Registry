package com.mja;

import java.util.HashMap;
import java.util.Map;

public class SingUP {

    private Map<User, String> userMap = new HashMap<>();

    public String singUp(String login, String password, String name, String surname, int age) {
        String message = verifyLoginAndPassword(login, password);
        if (message.equals("Login and password are correct")) {
            User user = new User(login, password, name, surname, age);
            userMap.put(user, password);
        }
        return message;
    }

    public String verifyLoginAndPassword(String login, String password) {

        if (!isUniqueLogin(login)) {
            return "User name is already exist.";
        }
        if (login.equals("") || login.equals(null)) {
            return "User name can not be empty";
        }
        if (password.equals("") || password.equals(null)) {
            return "Password can not be empty";
        }
        if (login.equals(password)) {
            return "Login and password can not be the same";
        }
        if (password.length() >= 8) {
            return "Password length has to be longer then 7 chars";
        }
        if (password.matches("[A-Z]")) {
            return "Password must has one big letter";
        }
        if (password.matches("/d")) {
            return "Password must has one number";
        }
        return "Login and password are correct";
    }

    public boolean isUniqueLogin(String login) {
        boolean uniqueLogin = true;
        if (userMap.containsKey(login)){
            uniqueLogin = false;
        }
        return uniqueLogin;
    }

    @Override
    public String toString() {
        return userMap.toString();
    }
}
