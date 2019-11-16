package com.mja;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class RegistryTest {

    Registry registry;

    @BeforeEach
    void setUpUserBase() {
        registry = new Registry();
        registry.signUp("User1", "password1", "name1", "surname2", 18);
        registry.signUp("User2", "password2", "name2", "surname2", 19);
        registry.signUp("User3", "password3", "name3", "surname3", 20);
    }

    @Test
    void notEmptyBaseTest() {
        Assertions.assertFalse(registry.getUserBase().isEmpty());
    }

    @Test
    void numberOfUserTest() {
        Assertions.assertEquals(3, registry.getUserBase().size());
    }

    @Test
    void signUpTest() {
        Assertions.assertEquals("password3", registry.getUserBase().get("User3").getPassword());
    }

}
