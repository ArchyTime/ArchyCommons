package it.archytime.archyfriends.utils;

import org.slf4j.Logger;

public class LogUtils {

    private static Logger logger;

    public static void setLogger(Logger logger) {
        LogUtils.logger = logger;
    }

    public static void info(String msg) {
        logger.info(msg);
    }

    public static void warn(String msg) {
        logger.warn(msg);
    }

    public static void error(String msg) {
        logger.error(msg);
    }

}
