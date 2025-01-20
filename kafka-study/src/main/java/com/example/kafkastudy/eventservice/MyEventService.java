package com.example.kafkastudy.eventservice;

import com.example.kafkastudy.sender.KafkaProducer;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class MyEventService {

    private final KafkaProducer kafkaProducer;

    public MyEventService(KafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    public void sendMsg() {
        Map<String, Object> data = new HashMap<>();
        data.put("x", 10);
        data.put("y", 20);

        kafkaProducer.send(KafkaProducer.TOPIC_NAME, data);
    }
}
