package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootVersion;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.SpringVersion;

@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
        System.out.println("SpringVersion: " + SpringVersion.getVersion());
        System.out.println("SpringBootVersion: " + SpringBootVersion.getVersion());
        System.getProperties().list(System.out);
    }

}
