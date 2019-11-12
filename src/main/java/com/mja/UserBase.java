package com.mja;

import java.util.HashMap;
import java.util.Map;

public class UserBase {

    private static UserBase INSTANCE;
    private Map<User, String> userMap = new HashMap<>();

    private UserBase(){

    }

    public UserBase getinstance() {
        if (INSTANCE == null) {
            INSTANCE = new UserBase();
        }
        return INSTANCE;
    }


}
