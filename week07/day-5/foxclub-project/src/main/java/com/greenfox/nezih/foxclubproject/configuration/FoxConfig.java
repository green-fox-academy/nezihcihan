package com.greenfox.nezih.foxclubproject.configuration;

import com.greenfox.nezih.foxclubproject.model.Fox;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FoxConfig {

    @Bean
    public Fox getFox() {
        return new Fox();
    }
}

