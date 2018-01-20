package com.shsxt.wc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018/1/20.
 */
@Controller
public class MainController {

    @RequestMapping("/main")
    public  String mainIndex () {
        return "main";
    }

}
