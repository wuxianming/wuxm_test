package com.wuxm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class controller {

    @RequestMapping(value = "/string", method = RequestMethod.GET)
    public String getString(){
        return "修改测试2222";
    }

}
