package ru.ruslan.spring.dz1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import ru.ruslan.spring.dz1.models.WeatherData;

@Component
public class WeatherProducer {

    @Value("${topic.name}")
    public String topicName;

    private final KafkaTemplate<String, WeatherData> kafkaTemplate;

    @Autowired
    public WeatherProducer(KafkaTemplate<String, WeatherData> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public String send(WeatherData data) {
        kafkaTemplate.send(topicName, data);

        return "Message sent to topic " + topicName;
    }
}
