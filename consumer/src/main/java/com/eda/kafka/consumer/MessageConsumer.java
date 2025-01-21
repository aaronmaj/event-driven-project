package com.eda.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

    @KafkaListener(topics = "messageTopic", groupId = "message")
    public void listen(String message) {
        System.out.println("Received message: " + message);
    }
}
