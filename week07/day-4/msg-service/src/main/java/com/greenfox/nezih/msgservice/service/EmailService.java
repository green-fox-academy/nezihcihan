package com.greenfox.nezih.msgservice.service;

public class EmailService implements MessageService {
    @Override
    public void sendMessage(String msg, String address) {
        System.out.println("Email sent to: " + address + " , with Message= " + msg);
    }
}