package com.example.evcdataservice.controller;

import com.example.evcdataservice.service.DemoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@RestController
@RequestMapping(value = "/getName")
public class DataServiceController {

    @Autowired
    private DemoServiceImpl demoService;

    @RequestMapping(value = "/getName")
    public String getName() {
        return demoService.getName();
    }


    public static void main(String[] args) {

        String str = "2019-12-17";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = sdf.parse(str);
            System.out.println(date);

        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println("今天：" + str.replaceAll("-",""));

        Calendar cal = Calendar.getInstance();
        cal.setTime(date); // 设置为当前时间
        cal.set(cal.HOUR_OF_DAY,-24);

        System.out.println(" 时间： " + sdf.format(cal.getTime()));


        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date); // 设置为当前时间
        calendar.set(Calendar.MONTH, calendar.get(Calendar.MONTH) - 1); // 设置为上一个月
        date = calendar.getTime();

        System.out.println("上一个月的时间： " + sdf.format(date));




    }
}
