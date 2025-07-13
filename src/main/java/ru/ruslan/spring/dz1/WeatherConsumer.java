package ru.ruslan.spring.dz1;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import ru.ruslan.spring.dz1.models.WeatherData;

@Component
public class WeatherConsumer {

    @KafkaListener(topics = "weather-topic", groupId = "weather-group")
    public WeatherData receive(WeatherData message){
        System.out.println("Новая информация по погоде:  " + message.getCity() + " " + message.getCondition() + " +" + message.getTemperature());
        return message;
    }

}
