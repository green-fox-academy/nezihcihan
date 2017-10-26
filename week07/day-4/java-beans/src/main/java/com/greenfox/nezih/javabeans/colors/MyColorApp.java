package com.greenfox.nezih.javabeans.colors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyColorApp {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ColorConfig.class);
        MyColor redColor = ctx.getBean(RedColor.class);
        redColor.printColor();
        MyColor blueColor = ctx.getBean(BlueColor.class);
        blueColor.printColor();
    }
}
