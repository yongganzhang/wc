package com.shsxt.wc.service;

import com.shsxt.wc.dao.UserDao;
import com.shsxt.wc.entity.User;
import com.shsxt.wc.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import javax.annotation.Resource;
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

    public Result userLogin(String userName, String userPwd) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("userName", userName);
        params.put("userPwd", userPwd);
        User one = userDao.findOne(params);
        if (one == null) {
            return Result.fail("登陆失败");
        }
        session.setAttribute("user", one);
        return Result.success("登陆成功");
    }

    public Result queryUserById(int id) {
        User user = userDao.get(id);
        return Result.success("查询成功", user);
    }

    public Result insertUser(User user) {
        long ste = userDao.saveSte(user);
        if (ste == 1) {
            return Result.success("插入数据成功");
        }
        return Result.fail("插入数据失败");
    }

    public Result delUser(int id) {
        long ste = userDao.delete(id);
        if (ste == 1) {
            return Result.success("删除数据成功");
        }
        return Result.fail("删除数据失败");
    }

    public Result updateUser(User user) {
        long ste = userDao.updateSte(user);
        if (ste == 1) {
            return Result.success("更新数据成功");
        }
        return Result.fail("更新数据失败");
    }

}
