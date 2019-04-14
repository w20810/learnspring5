/*
 * Hello.java
 * Copyright 2019 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package com.hellxing.spring.controller;

import com.hellxing.spring.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author yuxing
 *
 */
@Controller
public class Hello {

    @Autowired
    private HelloService mHelloService;

    @GetMapping(value = "/hello")
    @ResponseBody
    public String hello() {
        return "hello spring-5.0";
    }
}
