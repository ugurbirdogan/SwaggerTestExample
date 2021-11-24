package com.example.swaggerexampletest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SwaggerExampleTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SwaggerExampleTestApplication.class, args);
    }

}
