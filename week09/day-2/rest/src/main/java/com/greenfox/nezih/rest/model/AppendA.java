package com.greenfox.nezih.rest.model;

public class AppendA {

    String appendable = "";
    String appended;


    public AppendA(String appendable) {
        this.appended = appendable.concat("a");
    }

    public AppendA() {
    }

    public String getAppendable() {
        return appendable;
    }

    public void setAppendable(String appendable) {
        this.appendable = appendable;
    }

    public String getAppended() {
        return appended;
    }

    public void setAppended(String appended) {
        this.appended = appended;
    }


}
