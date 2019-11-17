package com.mja;

import com.mja.database.UserBase;
import com.mja.service.SignUp;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SignUpTest {

    SignUp signUp;

    @BeforeEach
    void setUp() {
        signUp = new SignUp(new UserBase());
    }

    @Test
    void correctLoginAndPassword() {
        Assertions.assertEquals("Login and password are correct", signUp.verifyLoginAndPassword("login","Password1"));
    }

    @Test
    void correctLoginAndPassword() {
        Assertions.assertEquals("Login and password are correct", signUp.verifyLoginAndPassword("login","Password1"));
    }

    @Test
    void correctLoginAndPassword() {
        Assertions.assertEquals("Login and password are correct", signUp.verifyLoginAndPassword("login","Password1"));
    }

    @Test
    void correctLoginAndPassword() {
        Assertions.assertEquals("Login and password are correct", signUp.verifyLoginAndPassword("login","Password1"));
    }

    @Test
    void correctLoginAndPassword() {
        Assertions.assertEquals("Login and password are correct", signUp.verifyLoginAndPassword("login","Password1"));
    }

    @Test
    void correctLoginAndPassword() {
        Assertions.assertEquals("Login and password are correct", signUp.verifyLoginAndPassword("login","Password1"));
    }

}
