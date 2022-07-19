package com.qcby.entity;

public class Verification {

    private long time;
    private String testCode;



    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getTestCode() {
        return testCode;
    }

    public void setTestCode(String testCode) {
        this.testCode = testCode;
    }

    @Override
    public String toString() {
        return "Verification{" +
                ", time=" + time +
                ", testCode='" + testCode + '\'' +
                '}';
    }
}
