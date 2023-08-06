package com.dbhelp;

import kim.sesame.common.web.context.SpringContextUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DbHelpApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(DbHelpApiApplication.class, args);
        SpringContextUtil.printStartInfo();
    }

}