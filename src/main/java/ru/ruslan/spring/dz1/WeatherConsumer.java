package ru.ruslan.spring.dz1;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.common.protocol.types.Field;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import ru.ruslan.spring.dz1.models.WeatherData;

@Component
public class WeatherConsumer {

    private static final String topicName = "weather-topic";


    @KafkaListener(topics = topicName, groupId = "weather-group")
    public WeatherData receive(WeatherData message){
        System.out.println("Новая информация по погоде:  " + message.getCity() + " " + message.getCondition() + " +" + message.getTemperature());
        return message;
    }

}
