package com.springcloud.provider.controller;

import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.awt.SunHints;

import javax.servlet.http.HttpServletRequest;

@RestController
public class Pcontroller {

    @RequestMapping(value = "/test")
    public String test(HttpServletRequest httpServletRequest){
        return "this provider service port is :" + httpServletRequest.getServerPort();
    }

}
