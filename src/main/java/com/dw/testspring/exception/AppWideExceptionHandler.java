package com.dw.testspring.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @ClassName AppWideExceptionHandler
 * @Description TODO
 * @Author Dingwei
 * @Date 2020/9/23 15:34
 * @Version 1.0
 */
@ControllerAdvice
public class AppWideExceptionHandler {

    @ExceptionHandler(CommonException.class)
    public String duplicateHandler(){
        System.out.println("出错了，稍后重试");
        return "出错了，稍后重试";
    }


}
