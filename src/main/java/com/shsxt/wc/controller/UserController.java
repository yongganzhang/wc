package com.shsxt.wc.controller;


import com.shsxt.wc.service.UserService;
import com.shsxt.wc.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 跳转 登陆页面
     *
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String userLoginIndex() {
        return "login";
    }

    @RequestMapping("/userLogin")
    public ModelAndView userLogin(String userName, String userPwd) {

        ModelAndView mv = new ModelAndView();
        Result result = userService.userLogin(userName, userPwd);
        mv.setViewName("forward:main");

        return mv;
    }

}
