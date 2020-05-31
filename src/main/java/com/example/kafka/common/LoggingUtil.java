package com.example.kafka.common;

import java.util.Map;

public class LoggingUtil {

    private static final String ERROR_MESSAGE_SUFFIX = "{}";

    private static final String LOGGING_EVENT_KEY = "LOGGING_EVENT";

    public static void logInfo(org.slf4j.Logger logger, String message, Map<String, String> map, LoggingEvent loggingEvent) {

        if (map != null) {
            map.put(LOGGING_EVENT_KEY, loggingEvent.name());
        }
        logger.info(message + ERROR_MESSAGE_SUFFIX, map);

    }

    public static void logError(org.slf4j.Logger logger, String message, Map<String, String> map, LoggingEvent loggingEvent) {

        if (map != null) {
            map.put(LOGGING_EVENT_KEY, loggingEvent.name());
        }
        logger.error(message + ERROR_MESSAGE_SUFFIX, map);
    }

    public static void logExceptionHandler(org.slf4j.Logger logger, String message, Throwable e) {
        logger.info(message, e);
    }
}
