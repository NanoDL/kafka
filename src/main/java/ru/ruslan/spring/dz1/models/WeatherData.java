package ru.ruslan.spring.dz1.models;

import lombok.*;
import org.springframework.aot.generate.Generated;

@Data

public class WeatherData {

    private String city;
    private String condition;
    private int temperature;

    public WeatherData(String city, String condition, int temperature) {
        this.city = city;
        this.condition = condition;
        this.temperature = temperature;
    }



    public WeatherData() {

    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
