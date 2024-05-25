package com.weatherproject.Weather_project.service;


import com.google.gson.Gson;
import com.weatherproject.Weather_project.model.WeatherData;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URI;
import java.util.Scanner;

@Service
@Slf4j
@RequiredArgsConstructor
public class Weather_projectService {
    Scanner scanner = new Scanner(System.in);



    public void getWeather() throws IOException, InterruptedException {
        OkHttpClient client = new OkHttpClient();
        String cityName = scanner.nextLine();
        final var uri = URI.create("http://api.weatherapi.com/v1/current.json?key=ac57493674af4b0ea86144110242005&q=" + cityName + "&api=no");
        Request request = new Request.Builder()
                .url(uri.toURL())
                .build();
        Response response = client.newCall(request).execute();
        Gson gson = new Gson();
        String name = WeatherData.Location.getName();
        String country = WeatherData.Location.getCountry();
        String lat_updated = WeatherData.Current.getLat_updated();
        double temp_c = WeatherData.Current.getTemp_c();
    }

}
