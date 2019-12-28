package com.mja;

import com.mja.database.UserBase;
import com.mja.service.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserServiceTest {

    UserService userService;

    String correctLoginAndPassword = "Login and password are correct";
    String notUniqueLogin = "User name is already exist";
    String emptyLogin = "User name can not be empty";
    String emptyPassword = "Password can not be empty";
    String sameLoginAndPassword = "Login and password can not be the same";
    String toShortPassword = "Password length has to be longer then 7 chars";
    String noBigLetterInPassword = "Password must has one big letter";
    String noNumberInPassword = "Password must has one number";

    @BeforeEach
    void setUp() {
        this.userService = new UserService(new UserBase());
    }

    @Test
    void correctLoginAndPassword() {
        Assertions.assertEquals(correctLoginAndPassword, userService.verifyLoginAndPassword("login","Password1"));
    }

    @Test
    void notUniqueLogin() {
        userService.addUser("User1", "Password1", "name1", "surname1", 18);
        Assertions.assertEquals(notUniqueLogin, userService.verifyLoginAndPassword("User1","Password1"));
    }

    @Test
    void emptyLogin() {
        Assertions.assertEquals(emptyLogin, userService.verifyLoginAndPassword("","Password1"));
    }

    @Test
    void emptyPassword() {
        Assertions.assertEquals(emptyPassword, userService.verifyLoginAndPassword("login",""));
    }

    @Test
    void sameLoginAndPassword() {
        Assertions.assertEquals(sameLoginAndPassword, userService.verifyLoginAndPassword("Login222","Login222"));
    }

    @Test
    void toShortPassword() {
        Assertions.assertEquals(toShortPassword, userService.verifyLoginAndPassword("login","Pass1"));
    }

    @Test
    void noBigLetterInPassword() {
        Assertions.assertEquals(noBigLetterInPassword, userService.verifyLoginAndPassword("login","password1"));
    }

    @Test
    void noNumberInPassword() {
        Assertions.assertEquals(noNumberInPassword, userService.verifyLoginAndPassword("login","Password"));
    }

}
