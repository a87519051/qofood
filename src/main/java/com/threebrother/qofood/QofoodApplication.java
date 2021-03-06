package com.threebrother.qofood;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.transaction.annotation.EnableTransactionManagement;

// 添加参数校验:http://www.spring4all.com/article/1225
// 添加后台管理页面
// 添加swagger  处理
// 添加分页  处理
//TODO 添加api文档导出:http://www.spring4all.com/article/699
//TODO 添加应用监控 Spring Boot提供基于http、ssh、telnet 对运行时的项目进行监控。
// 修改mapper.xml文件中的;号， 对serviceimpl中添加事务 处理
@SpringBootApplication
@EnableTransactionManagement
public class QofoodApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(QofoodApplication.class);
    }


    public static void main(String[] args) {
        SpringApplication.run(QofoodApplication.class, args);
    }
}
