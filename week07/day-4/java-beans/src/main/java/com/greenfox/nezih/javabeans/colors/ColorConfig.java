package com.greenfox.nezih.javabeans.colors;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ColorConfig  {
    @Bean
    public MyColor redColor() {
        return new RedColor();
    }
    @Bean
    public MyColor blueColor() {
        return new BlueColor();
    }
}
