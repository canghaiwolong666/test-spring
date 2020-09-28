package com.dw.testspring.controller;

import com.dw.testspring.exception.CommonException;
import com.dw.testspring.service.TestService;
import com.dw.testspring.vo.TestVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author Dingwei
 * @Date 2020/9/22 17:02
 * @Version 1.0
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/test1")
    @ResponseBody
    public String test1(@RequestParam(value = "username") String name,@RequestParam(value = "count",defaultValue = "20") int count){
        System.out.println(name + count);
      throw new CommonException();
    }

    @RequestMapping(value = "/test2/{username}/{count}",method = RequestMethod.GET)
    @ResponseBody
    public String test2(@PathVariable(value = "username") String name, @PathVariable(value = "count") int count){
        System.out.println(name + count);
        return "true";
    }

    @RequestMapping("/test3")
    @ResponseBody
    public String test3(){
        throw new CommonException();
    }

    @RequestMapping("/test4")
    @ResponseBody
    public String test4(int id){
        return testService.test1(id);
    }



}
