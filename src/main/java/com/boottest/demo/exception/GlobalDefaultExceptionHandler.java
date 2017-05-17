package com.boottest.demo.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;



/**
 * Created by Administrator on 2017/5/17 0017.
 */
@ControllerAdvice
public class GlobalDefaultExceptionHandler {

    @ResponseBody
    @ExceptionHandler(Exception.class)
    public String exceptionHandle(Exception e){
        System.out.println("get it!");
        e.printStackTrace();
        return e.getMessage();
    }
}
