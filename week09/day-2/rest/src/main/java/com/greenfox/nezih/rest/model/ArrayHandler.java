package com.greenfox.nezih.rest.model;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayHandler {

    ArrayList<Integer> numbers;

    public ArrayHandler(int a,int b,int c,int d) {
       numbers = new ArrayList<>(Arrays.asList(a,b,c,d));
    }

    public ArrayHandler() {
    }

    public ArrayList<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }
}
