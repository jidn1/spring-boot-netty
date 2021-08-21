package com.aqmd.netty.annotation;

public enum ObsoletedType {
    YES,
    NO;

    private ObsoletedType() {
    }

    public static boolean isObsoleted(ObsoletedType type) {
        return YES == type;
    }
}