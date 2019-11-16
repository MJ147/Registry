package com.mja.model;

import java.util.StringJoiner;

public class User implements Comparable {

    private String login;
    private String password;
    private String name;
    private String surname;
    private int age;

    public User(String login, String password, String name, String surname, int age) {
        this.login = login;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ","[", "]")
                .add("login='" + login + "'")
                .add("password='" + password + "'")
                .add("name='" + name + "'")
                .add("surname='" + surname + "'")
                .add("age=" + age)
                .toString();
    }
}
