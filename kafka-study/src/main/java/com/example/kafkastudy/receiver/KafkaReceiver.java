package com.example.kafkastudy.receiver;

import com.example.kafkastudy.sender.KafkaProducer;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaReceiver {

    @KafkaListener(topics = KafkaProducer.TOPIC_NAME, autoStartup = "true")
    public void eventHandler(Object event) {
        System.out.println("get data : " + event);
    }
}
