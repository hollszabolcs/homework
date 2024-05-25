package com.weatherproject.Weather_project.model;

public class WeatherData {
    int id;
    public class Location {
        private static String name;
        private static String country;
        public static String getName() {
            return name;
        }

        public static String getCountry() {
            return country;
        }

    }

    public static class Current {
        private static String lat_updated;
        private static double temp_c;

        public static String getLat_updated() {
            return lat_updated;
        }

        public static double getTemp_c() {
            return temp_c;
        }
    }
}
