package com.greenfox.nezih.rest.model;

public class Number {
    int received;
    int result;

    public Number (int received) {
        this.received = received;
        this.result = received * 2;
    }

    public int getReceived() {
        return received;
    }

    public void setReceived(int received) {
        this.received = received;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Number{" +
                "received=" + received +
                ", result=" + result +
                '}';
    }
}
