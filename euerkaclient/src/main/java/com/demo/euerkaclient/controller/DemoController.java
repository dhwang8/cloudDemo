package com.demo.euerkaclient.controller;


 import com.example.feignserver.controller.DemoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/getClien")
public class DemoController {

//    @Autowired
//    private DemoServiceImpl dataServiceController;
//
//    @RequestMapping(value = "/getClien")
//    public String getAAA(){
//        return "";
//    }



    @Autowired
    private DemoInterface demoInterface;

    @RequestMapping(value = "/getClien")
    public String getAAA(){
        return demoInterface.getName();
    }

}
