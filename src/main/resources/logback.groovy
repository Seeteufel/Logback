import ch.qos.logback.classic.encoder.PatternLayoutEncoder
import ch.qos.logback.classic.filter.LevelFilter

import static ch.qos.logback.core.spi.FilterReply.ACCEPT
import static ch.qos.logback.core.spi.FilterReply.DENY

appender("STDOUT", ConsoleAppender) {
    encoder(PatternLayoutEncoder) {
        pattern = "%d{HH:mm:ss.SSS} %-4relative [%thread] %-5level %logger{35} - %msg %n"
    }
}
appender("WARN_FILE", FileAppender) {
    file = "warning.log"
    append = true
    filter(LevelFilter) {
        level = WARN
        onMatch = ACCEPT
        onMismatch = DENY
    }
    encoder(PatternLayoutEncoder) {
        pattern = "%d{HH:mm:ss.SSS} %-4relative [%thread] %-5level %logger{30} - %msg%n"
    }
}
appender("ERROR_FILE", FileAppender) {
    file = "error.log"
    append = true
    filter(LevelFilter) {
        level = ERROR
        onMatch = ACCEPT
        onMismatch = DENY
    }
    encoder(PatternLayoutEncoder) {
        pattern = "%d{HH:mm:ss.SSS} %-4relative [%thread] %-5level %logger{30} - %msg%n"
    }
}
root(ALL, ["STDOUT", "WARN_FILE", "ERROR_FILE"])