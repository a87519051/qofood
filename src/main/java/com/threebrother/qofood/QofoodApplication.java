package com.threebrother.qofood;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

//TODO 添加参数校验:http://www.spring4all.com/article/1225
//TODO 添加后台管理页面
//TODO 添加swagger
//TODO 添加分页
//TODO 添加api文档导出:http://www.spring4all.com/article/699
@SpringBootApplication
public class QofoodApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(QofoodApplication.class);
    }


    public static void main(String[] args) {
        SpringApplication.run(QofoodApplication.class, args);
    }
}
