package com.joey.controller;

import com.joey.exception.BusinessException;
import com.joey.exception.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 *SMVC_10_Exception
 * SpringMVC 抛异常  往上抛  Dao(数据层) > 业务层(service) > 表现层 (controller)
 */


@RestControllerAdvice
public class ProjectExceptionAdvice {


    //@ExceptionHandler(填入要处理的异常)
    @ExceptionHandler(Exception.class)
    public Result doException(Exception e){
        System.err.println("—————— ฅ՞• •՞ฅ ———————");
        System.err.println("异常>>>>"+ e);

        return new Result(null,0);
    }

    @ExceptionHandler(BusinessException.class)
    public Result doBusinessException(BusinessException e){
        System.err.println("—————— ฅ՞• •՞ฅ ———————");
        System.err.println("BusinessException异常>>>>"+ e);

        return new Result(null,Code.BUSINESS_ERR,"BusinessException");
    }

    @ExceptionHandler(SystemException.class)
    public Result doSystemException(SystemException e){
        //日常开发规范 (这里就先不写了)
        //记录日志
        //发送消息给运维
        //发送邮件给开发人员

        System.err.println("—————— ฅ՞• •՞ฅ ———————");
        System.err.println("SystemException>>>>"+ e);

        return new Result(null,e.getCode(),"SystemException");
    }
}
