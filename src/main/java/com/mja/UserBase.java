package com.mja;

import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

public class UserBase {

    private static UserBase INSTANCE;
    private Map<User, String> userMap;

    private UserBase(){
        userMap = new HashMap<>();
    }

    public static UserBase getInstance() {
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

    @Override
    public String toString() {
        return new StringJoiner(", ", UserBase.class.getSimpleName() + "[", "]")
                .add("userMap=" + userMap)
                .toString();
    }
}
