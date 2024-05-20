package com.weatherproject.Weather_project.model;

public class APIData {
    public class Location {
        private static String name;
        private static String country;
        private static String tz_id;

        public static String getName() {
            return name;
        }

        public static String getCountry() {
            return country;
        }

        public static String getTz_id() {
            return tz_id;
        }
    }

    public static class Current {
        private String lat_updated;
        private String temp_c;

        public String getLat_updated() {
            return lat_updated;
        }

        public String getTemp_c() {
            return temp_c;
        }
    }
}
