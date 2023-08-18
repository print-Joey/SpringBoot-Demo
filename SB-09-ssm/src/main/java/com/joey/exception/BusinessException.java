package com.joey.exception;

/**
 *
 * 第一步 :
 * 创建自定义异常
 * 1.商业逻辑异常 (用户不规范操作) 比如 age 给字符串
 * 2.系统异常
 * 3.其他异常(技术)
 *
 * 下一步: BookServiceImpl
 */
public class BusinessException extends RuntimeException{

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    private  Integer code;



    public BusinessException(String message, Integer code) {
        super(message);
        this.code = code;
    }

    public BusinessException(String message, Throwable cause, Integer code) {
        super(message, cause);
        this.code = code;
    }

}
