package com.mja.database;

import com.mja.model.User;

import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

public class UserBase {

    private static UserBase INSTANCE;
    private Map<String, User> userMap;

    private UserBase(){
        userMap = new HashMap<>();
    }

    public static UserBase getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new UserBase();
        }
        return INSTANCE;
    }

    public Map<String, User> getUserMap() {
        return userMap;
    }

    public void setUserMap(Map<String, User> userMap) {
        this.userMap = userMap;
    }

    @Override
    public String toString() {
        StringJoiner stringJoiner = new StringJoiner("\n", "User Database:\n", "");
        for (User user : userMap.values()) {
            stringJoiner.add(user.toString());
        }
        return stringJoiner.toString();
    }

}
