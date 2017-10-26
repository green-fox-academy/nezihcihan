package com.greenfox.nezih.javabeans.colors;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RedConfig  {
    @Bean
    public RedColor redColor() {

        return new RedColor();
    }

}
