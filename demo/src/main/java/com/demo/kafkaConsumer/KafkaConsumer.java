package com.demo.kafkaConsumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;

public class KafkaConsumer {

    private static final Logger LOGGER= LoggerFactory.getLogger(KafkaConsumer.class);
    @KafkaListener(topics = "sp", groupId = "group-id")
    public void consume(String message)
    {
        LOGGER.info("Message received"+ message);
    }
}
