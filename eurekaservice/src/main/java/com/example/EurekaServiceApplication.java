package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class EurekaServiceApplication {

    @Value("${server.port}")
    String port;

    @GetMapping("home")
    public String home() {
        return "Hello World!";
    }

    @GetMapping("hi")
    public String service(@RequestParam(value = "name") String name) {
        return "hello " + name + ", this msg response from port: " + port;
    }

    public static void main(String[] args) {
        SpringApplication.run(EurekaServiceApplication.class);
    }
}
