package com.house.controller;

import com.house.service.PubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by cheng on 2017/10/14.
 */
@RestController
@RequestMapping("/pub")
public class PubController {

    @Autowired
    private PubService pubService;

    @RequestMapping("/addHouseInfo")
    public Object addHouse(){
        return new Date();
    }

}
