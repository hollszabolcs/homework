package com.weatherproject.Weather_project.controller;

import com.weatherproject.Weather_project.service.GetJsonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Weather_projectController {
    @Autowired
    private RestTemplate restTemplate;
    private final GetJsonService getJsonService;

    @Autowired
    public Weather_projectController(GetJsonService getJsonService) {
        this.getJsonService = getJsonService;
    }

    @GetMapping("/getfromapi")
    public String GetDataFromApi() {
        try {
            getJsonService.processJsonData();
            return "data has saved sucessfully";
        } catch (Exception e) {
            return "Error during the saveing: " + e.getMessage();
        }
    }
}
