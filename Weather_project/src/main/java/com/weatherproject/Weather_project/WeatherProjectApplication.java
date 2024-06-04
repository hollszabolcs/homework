package com.weatherproject.Weather_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class WeatherProjectApplication {
    public static void main(String[] args) {
        SpringApplication.run(WeatherProjectApplication.class, args);
    }
}
