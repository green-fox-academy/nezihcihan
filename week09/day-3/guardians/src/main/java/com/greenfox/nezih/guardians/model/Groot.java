package com.greenfox.nezih.guardians.model;

public class Groot {
    String received;
    String translated;

    public Groot(String message) {
        this.received = message;
        this.translated = "I am Groot!";
    }

    public String getReceived() {
        return received;
    }

    public void setReceived(String received) {
        this.received = received;
    }

    public String getTranslated() {
        return translated;
    }

    public void setTranslated(String translated) {
        this.translated = translated;
    }

}
