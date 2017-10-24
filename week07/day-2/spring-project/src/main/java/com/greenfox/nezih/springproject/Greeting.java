package com.greenfox.nezih.springproject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.concurrent.atomic.AtomicLong;

//@Data
@Getter
@Setter
@AllArgsConstructor
public class Greeting {
    private static AtomicLong id = new AtomicLong(0);
    private static String content;

    public Greeting(String content) {
        this.id.incrementAndGet();
        this.content = content;
    }
    public AtomicLong getId() {
        return this.id;
    }

    public String getContent() {

        return this.content;
    }
}
