package com.greenfox.nezih.javabeans.colors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyColorApp {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(RedConfig.class);
        RedColor myColor = ctx.getBean(RedColor.class);
        myColor.printColor();
    }
}
