package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableOpenApi
@SpringBootApplication
public class ClpsTestElshachApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClpsTestElshachApplication.class, args);
    }

}
