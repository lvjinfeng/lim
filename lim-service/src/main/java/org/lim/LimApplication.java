package org.lim;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"org.lim.*"})
@SpringBootApplication
public class LimApplication {
    public static void main(String[] args) {
        SpringApplication.run(LimApplication.class);
    }
}
