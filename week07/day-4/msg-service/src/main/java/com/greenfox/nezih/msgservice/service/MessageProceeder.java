package com.greenfox.nezih.msgservice.service;

import org.springframework.beans.factory.annotation.Autowired;

public class MessageProceeder {

    @Autowired
    MessageService service;

    public void processMessage(String msg, String address) {
        service.sendMessage(msg, address);
    }
}
