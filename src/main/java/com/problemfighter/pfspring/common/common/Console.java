package com.problemfighter.pfspring.common.common;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Console {


    private static final Logger logger = LoggerFactory.getLogger(Console.class);

    public static void log(String message) {
        log(message, track());
    }

    public static void debug(String message) {
        logger.debug(message);
    }

    public static void error(String message) {
        logger.error(message);
    }

    public static void info(String message) {
        logger.info(message);
    }

    public static void trace(String message) {
        logger.trace(message);
    }

    public static void warn(String message) {
        logger.info(message);
    }

    private static String processTrace(Throwable log) {
        StackTraceElement element = null;
        String trace = "";
        if (log.getStackTrace().length > 3) {
            element = log.getStackTrace()[2];
        }
        if (element != null) {
            trace = "  << " + element.getFileName() + " line: " + element.getLineNumber();
        }
        return trace;
    }

    private static void log(String message, Throwable log) {
        logger.debug(message + processTrace(log));
    }


    public static Throwable track() {
        return new ConsoleException("File Tracking");
    }

}
