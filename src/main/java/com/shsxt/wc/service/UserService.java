package com.shsxt.wc.service;

import com.shsxt.wc.dao.UserDao;
import com.shsxt.wc.entity.User;
import com.shsxt.wc.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * 用户服务
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    @Autowired(required = false)
    private HttpSession session;

    public Result userLogin (String userName, String userPwd) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("userName",userName );
        params.put("userPwd",userPwd );
        User one = userDao.findOne(params);
        if (one == null) {
          return  Result.fail("登陆失败");
        }
        session.setAttribute("user",one );
        return  Result.success("登陆成功");
    }



}
