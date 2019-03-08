package main;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class log4j_example {

    static Logger log = Logger.getRootLogger();

    public static void main(String args[]) {
        PropertyConfigurator.configure("log4j.properties");
        log.trace("Trace message");
        log.debug("Debug message");
        log.info("Info message");
        log.warn("Warn message");
        log.error("Error message");
        log.fatal("Fatal message");

// Uncomment code below to reach maximum file size and create another log file in log directory      
//        for (int i = 0; i <= 10000; i++) {
//            log.trace("Trace message");
//            log.debug("Debug message");
//            log.info("Info message");
//            log.warn("Warn message");
//            log.error("Error message");
//            log.fatal("Fatal message");
//        }
    }
}
