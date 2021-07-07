package com.yonyou.demo.controller;

import com.yonyou.demo.bean.PersonBean;
import com.yonyou.demo.service.ITempTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tempTable")
public class TempTableController {

    @Autowired
    private ITempTableService tempTableService;

    @RequestMapping("/tempTableSimpleTest")
    public List<PersonBean> tempTableSimpleTest(){
        return tempTableService.tempTableSimpleTest();
    }

}
