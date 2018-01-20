package com.shsxt.wc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloContoller {

	@RequestMapping("/hello")
	@ResponseBody
	public String index() {
		return "hello";
	}
}
