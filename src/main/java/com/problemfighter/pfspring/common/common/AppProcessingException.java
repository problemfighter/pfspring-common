package com.problemfighter.pfspring.common.common;

import java.io.IOException;

public class AppProcessingException extends IOException {


    public AppProcessingException() {
        super("App Processing Exception");
    }

    public AppProcessingException(String message) {
        super(message);
    }

    public static void throwException(String message) throws AppProcessingException {
        throw new AppProcessingException(message);
    }
}
