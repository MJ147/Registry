package com.mja;

public class RegistryTest {

    public static void main(String[] args) {

        SingUP registry = new SingUP();
        registry.singUp("User1", "password1", "name", "surname", 18);
        registry.singUp("","", "","", 18);


        registry.toString();
    }
}
