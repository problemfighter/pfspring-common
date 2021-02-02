package com.problemfighter.pfspring.common.common;

import org.springframework.lang.Nullable;

import java.util.Random;
import java.util.UUID;

public final class AppCommonUtil {

    public static String uuid() {
        return UUID.randomUUID().toString().toUpperCase();
    }


    public static String randomAlphanumeric(Integer limit) {
        int leftLimit = 48;
        int rightLimit = 122;
        Random random = new Random();
        return random.ints(leftLimit, rightLimit + 1)
                .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
                .limit(limit)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }


    public static String randomNumeric(Integer limit, Integer boundary) {
        Random rand = new Random();
        return String.format("%0" + limit + "d", rand.nextInt(boundary));
    }

    public static Boolean stringIsNullOrEmpty(@Nullable String string) {
        return string == null || string.isEmpty();
    }

}
