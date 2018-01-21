package com.shsxt.wc.exception;


import lombok.Getter;

/**
 * 全局异常
 */
@Getter
public class GlobalException extends  RuntimeException {

    private String code;

    private Object obj;

    public  GlobalException (String code , String msg ) {
        super(msg);
        this.code = code;

    }

    public  GlobalException ( String msg ) {
        super(msg);
    }


    public  GlobalException (String code , String msg , Object obj ) {
        super(msg);
        this.code = code;
        this.obj = obj;

    }




}
