package com.example.feignserver.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "evc-dataservice")
@RequestMapping(value = "/getName")
public interface DemoInterface {

    @RequestMapping("/getName")
    public String getName();
}
