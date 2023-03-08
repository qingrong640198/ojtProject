package com.ojt.demo.business.demo01.service;

import org.springframework.stereotype.Service;

import com.ojt.demo.business.demo01.entity.Demo01Entity;

@Service
public class Demo01Service {

    public Demo01Entity init() {
        
        Demo01Entity entity = new Demo01Entity();
        entity.setUuid("1");
        return entity;
    }
    
}
