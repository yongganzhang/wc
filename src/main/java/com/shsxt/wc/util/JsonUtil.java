package com.shsxt.wc.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class JsonUtil {

    // 日志
    private static final Logger LOGGER = LoggerFactory.getLogger(JsonUtil.class);

    public static String writeObjToJson(Object obj) {
        ObjectMapper mapper = new ObjectMapper();
        String json = null;
        try {
            json = mapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            if (LOGGER.isErrorEnabled()) {
                LOGGER.error(" json解析异常 ： {}", e.getMessage());
            }
        }
        return json;
    }

    /**
     * 写出页面
     *
     * @param response
     * @param json
     */
    public static void write(HttpServletResponse response, String json) {
        response.setContentType("application/json; charset=utf-8");
        PrintWriter writer = null;
        try {
            writer = response.getWriter();
            writer.write(json);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null)
                writer.close();
        }
    }

}
