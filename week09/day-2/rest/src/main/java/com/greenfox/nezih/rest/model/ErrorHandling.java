package com.greenfox.nezih.rest.model;

public class ErrorHandling {

    String error;

    public ErrorHandling(String error) {
        this.error = error;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
