package com.ribbon.demo.DemoController;

import com.ribbon.demo.DemoService.DemoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/getName")
public class DemoController {

    @Autowired
    private DemoServiceImpl demoService;

    @RequestMapping(value = "/demo")
    public String getName(){
        return demoService.hiService("5555");
    }
}
