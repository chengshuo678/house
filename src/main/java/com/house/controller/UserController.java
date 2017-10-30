package com.house.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by cheng on 2017/10/12.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    private final Logger log = Logger.getLogger(this.getClass());

    @RequestMapping("/sys")
    public Object test(){
        return new Date();
    }

}
