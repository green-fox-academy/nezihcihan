package com.greenfox.nezih.rest.model;

import java.util.ArrayList;

public class Result {
    int result;
    ArrayList<Integer> resultList = new ArrayList<>();

    public Result() {
    }

    public Result(int result) {
        this.result = result;

    }

    public Result(int result, ArrayList<Integer> resultList) {
        this.result = result;
        this.resultList = resultList;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public ArrayList<Integer> getResultList() {
        return resultList;
    }

    public void setResultList(ArrayList<Integer> resultList) {
        this.resultList = resultList;
    }
}
