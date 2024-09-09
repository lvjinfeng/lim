package org.lim;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"org.lim.*"})
@SpringBootApplication
@EnableDubbo
public class LimApplication {
    public static void main(String[] args) {
        SpringApplication.run(LimApplication.class);
    }
}
