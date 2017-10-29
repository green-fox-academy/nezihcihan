package com.greenfox.nezih.msgservice.config;

import com.greenfox.nezih.msgservice.service.EmailService;
import com.greenfox.nezih.msgservice.service.MessageProceeder;
import com.greenfox.nezih.msgservice.service.MessageService;
import com.greenfox.nezih.msgservice.service.TwitterService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
@ComponentScan
@Configuration
public class MessageConfiguration {

    @Bean
    MessageService emailService() {
        return new EmailService();
    }

    MessageService twitterService() {
        return new TwitterService();
    }
    @Bean
    MessageProceeder messageProceeder() {
        return new MessageProceeder();
    }


}