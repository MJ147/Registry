package com.mja.database;

import com.mja.model.User;

import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

public class UserBase {


    private Map<String, User> userMap;

    public UserBase(){
        userMap = new HashMap<>();
    }

    public Map<String, User> getUserMap() {
        return userMap;
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
