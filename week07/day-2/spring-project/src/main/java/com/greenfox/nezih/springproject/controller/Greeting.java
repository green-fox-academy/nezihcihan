package com.greenfox.nezih.springproject.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
//@Data
@Getter
@Setter
@AllArgsConstructor
public class Greeting {
    private long id;
    private String content;
}
