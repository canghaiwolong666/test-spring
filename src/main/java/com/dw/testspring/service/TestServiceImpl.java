package com.dw.testspring.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @ClassName TestServiceImpl
 * @Description TODO
 * @Author Dingwei
 * @Date 2020/9/24 10:39
 * @Version 1.0
 */
@Service
public class TestServiceImpl implements TestService {


    @Override
    @Cacheable(value = "realTimeCache",key = "#id")
    public String test1(int id) {
        System.out.println("从DB中查询");
        return "缓存测试" + id;
    }
}
