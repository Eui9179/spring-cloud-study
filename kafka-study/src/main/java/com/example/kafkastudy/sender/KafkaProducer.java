package com.example.kafkastudy.sender;

import com.example.kafkastudy.eventservice.MyJacksonConverter;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaProducer {

    public static final String TOPIC_NAME = "study";

    public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    private final KafkaTemplate<String, String> kafkaTemplate;

    public void send(String topic, Object data) {
        try {
            kafkaTemplate.send(topic, MyJacksonConverter.toJson(data));
        } catch (Exception e) {
            System.err.println("error" + e);
        }
    }
}
