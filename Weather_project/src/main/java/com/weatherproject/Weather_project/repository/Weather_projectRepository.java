package com.weatherproject.Weather_project.repository;

import com.weatherproject.Weather_project.model.WeatherData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Weather_projectRepository extends JpaRepository<WeatherData, Integer> {
}

