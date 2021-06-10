package intro.tasks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    public static void main(String[] args) {

        Person adam = new Person("Adam", "Baldwin",
                new Address("London", "548-AU4H", "Raw street", 120),
                23);

        Logger logger = LoggerFactory.getLogger("intro.tasks.Main");

        logger.debug("Hello World fro logback");
        logger.error("FATAL");
        logger.warn("warning from logback");
        logger.info(adam.toString());
    }
}
