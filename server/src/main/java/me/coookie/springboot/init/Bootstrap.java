package me.coookie.springboot.init;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by cookie on 2017/9/29.
 */
@Configuration
@ComponentScan(basePackages = "me.coookie.springboot")
@EnableAutoConfiguration
@Slf4j
public class Bootstrap {

    public static void main(String[] args) {
        log.info("spring boot start!!!");
        SpringApplication springApplication = new SpringApplication(args);
        springApplication.run(Bootstrap.class, args);
    }
}
