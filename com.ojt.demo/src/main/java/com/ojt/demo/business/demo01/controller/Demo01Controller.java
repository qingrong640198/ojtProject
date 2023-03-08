package com.ojt.demo.business.demo01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ojt.demo.business.demo01.entity.Demo01Entity;
import com.ojt.demo.business.demo01.form.Demo01Form;
import com.ojt.demo.business.demo01.service.Demo01Service;

/**
 * <dd>画面：demoクラスです。
 * <dd>概要：demo。
 * <dd>履歴
 * <dd>NO 日付         Ver     更新者               内容
 * <dd>1  2022/07/11   V1.0.0  Fujias)賈銘威     新規作成
 */
@Controller
@RequestMapping("/demo01")
public class Demo01Controller {
    
    @Autowired
    private Demo01Service service;

    /**
     * <dd>概要： demo画面を初期化する
     * 
     * @return 画面View
     */
    @GetMapping("/init")
    public ModelAndView init() {
        
        Demo01Entity entity = service.init();
        
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("entity", entity);
        modelAndView.setViewName("demo01");
        return modelAndView;
    }
    
    /**
     * <dd>概要： 画面からのデータを検証する。
     * 
     * @param form 画面フォーム
     * @return 検証結果
     */
    @PostMapping("/cehck")
    @ResponseBody
    public void check(@RequestBody Demo01Form form) {
        
    }
    
    /**
     * <dd>概要： 画面からのデータを保存する。
     * 
     * @param form 画面フォーム
     * @return 保存結果
     */
    @PostMapping("/save")
    @ResponseBody
    public void save(@RequestBody Demo01Form form) {
        
    }
}
