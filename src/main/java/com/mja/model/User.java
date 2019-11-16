package com.mja.model;

import com.mja.utility.IdGenerator;

import java.util.StringJoiner;

public class User implements Comparable {

    private long id;
    private String login;
    private String password;
    private String name;
    private String surname;
    private int age;
    private boolean isSignIn;

    public User(String login, String password, String name, String surname, int age) {
        this.id = IdGenerator.nextClientId();
        this.login = login;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.isSignIn = false;
    }

    public long getId() {
        return id;
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

    public boolean isSignIn() {
        return isSignIn;
    }

    public void setLogIn(boolean logIn) {
        isSignIn = logIn;
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
