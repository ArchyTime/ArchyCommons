package it.archytime.archyfriends.utils;

import org.slf4j.Logger;

public class LogUtils {

    private Logger logger;

    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    public void info(String msg) {
        logger.info(msg);
    }

    public void warn(String msg) {
        logger.warn(msg);
    }

    public void error(String msg) {
        logger.error(msg);
    }

}
