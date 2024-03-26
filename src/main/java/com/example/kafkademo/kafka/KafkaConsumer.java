package com.example.kafkademo.kafka;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {
    private Logger logger = LoggerFactory.getLogger(KafkaConsumer.class.getName());

    @KafkaListener(topics = "course", groupId = "my_consumer")
    public void listen(String message) {
        log.info("Received message: " + message);
    }
}
