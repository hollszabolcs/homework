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
        private static String lat_updated;
        private static String temp_c;

        public static String getLat_updated() {
            return lat_updated;
        }

        public static String getTemp_c() {
            return temp_c;
        }
    }
}
