package com.weatherproject.Weather_project.service;

import com.google.gson.Gson;
import com.weatherproject.Weather_project.model.WeatherData;
import com.weatherproject.Weather_project.repository.Weather_projectRepository;
import org.springframework.stereotype.Service;

@Service
public class GetJsonService {
    private final Weather_projectService weatherProjectService;
    private final Weather_projectRepository weather_projectRepository;

    public GetJsonService(Weather_projectService weatherProjectService, Weather_projectRepository weatherProjectRepository) {
        this.weatherProjectService = weatherProjectService;
        this.weather_projectRepository = weatherProjectRepository;
    }

    public void processJsonData() {
        String jsonData = weatherProjectService.getWeatherFromApi();
        Gson gson = new Gson();
        WeatherData weatherData = gson.fromJson(jsonData, WeatherData.class);
        weather_projectRepository.save(weatherData);
    }
}
