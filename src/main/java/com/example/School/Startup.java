package com.example.School;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class Startup
{
    @PostConstruct
    public void init() {
        System.out.println("MYSQL_HOST: " + System.getenv("MYSQL_HOST"));
        System.out.println("MYSQL_PORT: " + System.getenv("MYSQL_PORT"));
        System.out.println("MYSQL_DATABASE: " + System.getenv("MYSQL_DATABASE"));
        System.out.println("MYSQL_USER: " + System.getenv("MYSQL_USER"));
        System.out.println("MYSQL_PASSWORD: " + System.getenv("MYSQL_PASSWORD"));
    }
}
