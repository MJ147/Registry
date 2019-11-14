package com.mja;

public class SingUp {

    private UserBase userBase;

    public SingUp(UserBase userBase) {
        this.userBase = userBase;
    }

    public String addUser(String login, String password, String name, String surname, int age) {
        String message = verifyLoginAndPassword(login, password);
        if (message.equals("Login and password are correct")) {
            User user = new User(login, password, name, surname, age);
            userBase.getUserMap().put(user, password);
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
        if (userBase.getUserMap().containsKey(login)) {
            uniqueLogin = false;
        }
        return uniqueLogin;
    }

}
