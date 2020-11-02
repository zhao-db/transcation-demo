package com.example.demo.transcational.transcationaldemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class TranscationalDemoApplication {


    public static void main(String[] args) {
        SpringApplication.run(TranscationalDemoApplication.class, args);
    }

}
