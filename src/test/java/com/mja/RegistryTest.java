package com.mja;

public class RegistryTest {

    public static void main(String[] args) {

        Registry registry = new Registry();
        registry.singUp("User1", "password1", "name1", "surname2", 18);
        registry.singUp("User2", "password2", "name2", "surname2", 19);
        registry.singUp("User3", "password3", "name3", "surname3", 20);



        registry.printUserBase();
    }
}
