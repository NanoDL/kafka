package ru.ruslan.spring.dz1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import ru.ruslan.spring.dz1.service.WeatherCreateService;

@Component
public class ScheludeTask {

    private final WeatherCreateService weatherCreateService;

    @Autowired
    public ScheludeTask(WeatherCreateService weatherCreateService) {
        this.weatherCreateService = weatherCreateService;
    }
    @Scheduled(fixedRate = 2000)
    public void reportCurrentWeather(){
        weatherCreateService.updateWeather();
    }
}
