package ru.ruslan.spring.dz1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ruslan.spring.dz1.WeatherProducer;
import ru.ruslan.spring.dz1.models.WeatherData;

import java.util.Random;

@Service
public class WeatherCreateService {
    private WeatherProducer weatherProducer;

    @Autowired
    public WeatherCreateService(WeatherProducer weatherProducer) {
        this.weatherProducer = weatherProducer;
    }


    private String[] condition = {
            "Солнечно",
            "Облачно",
            "Дождь",};

    public String updateWeather() {
        Random random = new Random();
        int index = random.nextInt(condition.length);

        WeatherData data = new WeatherData("Москва", condition[index], random.nextInt(35));

        return weatherProducer.send(data);
    }
}
