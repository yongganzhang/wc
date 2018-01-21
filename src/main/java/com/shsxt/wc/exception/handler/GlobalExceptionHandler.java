package com.shsxt.wc.exception.handler;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.shsxt.wc.exception.GlobalException;
import com.shsxt.wc.util.JsonUtil;
import com.shsxt.wc.util.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 全局异常处理器
 */
public class GlobalExceptionHandler implements HandlerExceptionResolver {

    // 日志
    private static final Logger LOGGER = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    /**
     * 异常处理
     *
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @return
     */
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {

        ModelAndView mv = new ModelAndView();
        Result fail = null;
        //  1. 自定义异常
        if (ex instanceof GlobalException) {
            GlobalException globalException = (GlobalException) ex;
            // 需要组装成结果集返回
            fail = Result.fail(globalException.getCode(), globalException.getMessage());

        } else {  //  2.系统异常
            if (LOGGER.isErrorEnabled()) {
                LOGGER.error(" 未知错误 ： {}", ex.getMessage());
            }
            fail = Result.fail("500", "网络异常，稍后重试");
        }
        // 写出结果集
        JsonUtil.write(response, JsonUtil.writeObjToJson(fail));
//            String json = JsonUtil.writeObjToJson(fail);
//            JsonUtil.write(response,json);
        return mv;
    }

}
