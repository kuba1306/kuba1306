package com.kodilla.patterns.singleton;

public enum Logger {

    INSTANCE;

    private String lastLog = "byly sobie pieski 2";

    public void log(final String log) {
        lastLog = log;
        System.out.println(lastLog);
    }

    public String getLastLog() {
        return lastLog;
    }
}
