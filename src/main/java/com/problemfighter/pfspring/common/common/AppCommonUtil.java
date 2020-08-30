package com.problemfighter.pfspring.common.common;

import java.util.UUID;

public final class AppCommonUtil {

    public static String uuid() {
        return UUID.randomUUID().toString().toUpperCase();
    }


}
