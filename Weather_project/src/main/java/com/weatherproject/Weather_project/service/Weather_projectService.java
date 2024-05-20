package com.weatherproject.Weather_project.service;


import com.google.gson.Gson;
import com.weatherproject.Weather_project.model.APIData;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.net.URI;
import java.util.Scanner;


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
        String name = APIData.Location.getName();
        String country = APIData.Location.getCountry();
        String tz_id = APIData.Location.getTz_id();

    }

}
