package com.lgq.lgq_jenkins.controller;

import com.lgq.lgq_jenkins.service.Test1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: lgq_jenkins
 * @description
 * @author: lgq
 * @create: 2020-03-16 16:40
 **/
@RestController
public class TestController1 {

    @Autowired
    Test1 test1;

    @GetMapping("/ttt")
    public String t1(){
        return test1.fun1();
    }
}
