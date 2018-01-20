package com.shsxt.wc.util;

import java.io.Serializable;

public class Result<T> implements Serializable {

    private final static  String  SUCCESS_CODE = "200";

    private final static  String  FAIL_CODE = "500";

    private static final long serialVersionUID = 4715302481089778942L;

    private String code;
    private String msg;
    private T data;

    public Result() {
    }

    public Result(String code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static Result success(String msg, Object data) {
        Result<Object> result = new Result();
        result.setCode(SUCCESS_CODE);
        result.setMsg(msg);
        result.setData(data);
        return result;
    }

    public static Result success(String msg) {

        Result<Object> result = new Result();
        result.setCode(SUCCESS_CODE);
        result.setMsg(msg);
        return result;
    }

    public static Result fail(String msg, Object data) {
        Result<Object> result = new Result();
        result.setCode(FAIL_CODE);
        result.setMsg(msg);
        result.setData(data);
        return result;
    }

    public static Result fail(String msg) {

        Result<Object> result = new Result();
        result.setCode(FAIL_CODE);
        result.setMsg(msg);
        return result;
    }

    public static Result fail(String code, String msg) {
        Result<Object> result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
