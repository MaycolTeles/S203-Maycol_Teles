package com.inatel.arquitetura;

public class LogManager2 {

    // cache
    private static LogManager2 instance;

    // Private constructor
    private LogManager2() {}

    public static LogManager2 getInstance() {
        if (instance == null)
            instance = new LogManager2();

        return instance;
    }

    public void info(String msg) {
        System.out.println("INFO: " + msg);
    }

    public void error(String msg) {
        System.out.println("ERROR: " + msg);
    }
    
    public void warn(String msg) {
        System.out.println("WARNING: " + msg);
    }
}
