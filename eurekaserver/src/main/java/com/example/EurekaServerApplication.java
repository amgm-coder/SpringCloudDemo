package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaServer
@RestController
public class EurekaServerApplication {

    @GetMapping("home")
    public String home() {
        return "Hello World!";
    }


    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class);
    }


}
