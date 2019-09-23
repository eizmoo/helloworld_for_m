package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@SpringBootApplication
public class DemoApplication {

    private static Logger logger = LoggerFactory.getLogger(DemoApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        logger.info("启动成功。这句话是自己加的，出现上面的Started DemoApplication in x.xx seconds 就算启动成功");
        logger.info("启动日志有Tomcat started on port(s):xx。这个xx就是启动端口");
        logger.info("访问url为 localhsot:端口 ");
    }

    @RequestMapping("")
    public String hello() {
        return "Hello World!";
    }

}
