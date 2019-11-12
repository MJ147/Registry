package com.mja;

import java.util.HashMap;
import java.util.Map;

public class UserBase {

    private static UserBase INSTANCE;
    private Map<User, String> userMap;

    private UserBase(){
        userMap = new HashMap<>();
    }

    public UserBase getinstance() {
        if (INSTANCE == null) {
            INSTANCE = new UserBase();
        }
        return INSTANCE;
    }

    public Map<User, String> getUserMap() {
        return userMap;
    }

    public void setUserMap(Map<User, String> userMap) {
        this.userMap = userMap;
    }
}
