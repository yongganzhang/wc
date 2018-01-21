package com.shsxt.wc.controller;

import com.shsxt.wc.entity.User;
import com.shsxt.wc.exception.GlobalException;
import com.shsxt.wc.service.UserService;
import com.shsxt.wc.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//@Controller
@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/{id}")
//    @ResponseBody
    public Result queryUserById(@PathVariable("id") int id) {

//        throw  new GlobalException("哈哈哈测试");
        int i = 1 / 0;
        return userService.queryUserById(id);
    }

    @PostMapping("/user")
//    @ResponseBody
    public Result insertUserById(User user) {
        return userService.insertUser(user);
    }

    @DeleteMapping("/user/{id}")
//    @ResponseBody
    public Result delUserById(@PathVariable int id) {
        return userService.delUser(id);
    }

    @PutMapping("/user")
//    @ResponseBody
    @RequestMapping(value = "/user", method = RequestMethod.PUT)
    public Result updateUserById(User user) {
        return userService.updateUser(user);
    }

}
