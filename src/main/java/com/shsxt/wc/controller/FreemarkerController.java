package com.shsxt.wc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Administrator on 2018/1/21.
 */
@Controller
public class FreemarkerController {

    @GetMapping("/test")
    public String index () {
        return  "test";
    }

}
