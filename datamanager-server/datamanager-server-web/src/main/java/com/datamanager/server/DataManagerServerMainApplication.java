package com.datamanager.server;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @program: com.datamanager.server
 * @description: springboot启动类
 * @author: liujinghui
 * @create: 2019-03-08 22:42
 **/
@EnableDubbo
@SpringBootApplication(scanBasePackages = {"com.datamanager.server.web","com.datamanager.server.api","com.datamanager.server.impl"})
@MapperScan("com.datamanager.server.api.**.dao")
public class DataManagerServerMainApplication {

    public static void main(String[] args) {
        SpringApplication.run(DataManagerServerMainApplication.class,args);
    }
}
