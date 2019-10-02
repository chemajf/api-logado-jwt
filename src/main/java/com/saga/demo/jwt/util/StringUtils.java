package com.saga.demo.jwt.util;

public class StringUtils extends org.springframework.util.StringUtils {

    public StringUtils() {
        super();
    }

    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }
}
