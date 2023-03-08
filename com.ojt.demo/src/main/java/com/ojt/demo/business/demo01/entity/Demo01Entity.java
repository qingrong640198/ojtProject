package com.ojt.demo.business.demo01.entity;

import com.ojt.demo.business.demo01.form.Demo01Form;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper =  false)
public class Demo01Entity extends Demo01Form {
    
    private String id;
    
    private String name;
    
    private Integer age;

}
