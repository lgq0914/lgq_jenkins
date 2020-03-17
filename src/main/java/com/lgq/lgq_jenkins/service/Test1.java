package com.lgq.lgq_jenkins.service;

import org.springframework.stereotype.Component;

/**
 * @program: lgq_jenkins
 * @description
 * @author: lgq
 * @create: 2020-03-16 16:39
 **/

@Component
public class Test1 {

    public String fun1(){
        String a = "这是我的第一个Jenkins部署的实例！";
        System.out.println(a);
        return a;
    }
}
