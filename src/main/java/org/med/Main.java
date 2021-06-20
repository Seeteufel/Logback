package org.med;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);
//    private static final ch.qos.logback.classic.Logger logger2 = (ch.qos.logback.classic.Logger) LoggerFactory.getLogger(Main.class);


    public static void main(String[] args) {

        logger.debug("DEBUG");
        logger.info("INFO");
        logger.warn("WARNING");
        logger.error("ERROR");
        // <SLF4J> logger.fatal() -> http://www.slf4j.org/faq.html#fatal
    }
}
