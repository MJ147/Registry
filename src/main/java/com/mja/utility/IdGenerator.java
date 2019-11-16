package com.mja.utility;

public class IdGenerator {

    private static long clientId;

    public static long nextClientId() {
        return ++clientId;
    }
}
