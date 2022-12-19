package com.demo.kafkaProducer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

import java.util.logging.Level;

public class KafkaProducer {

    public static final Logger LOGGER= LoggerFactory.getLogger(KafkaProducer.class);

    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    public void sendMessage(String message)
    {
        LOGGER.info("FOr message"+message);
        System.out.println("message ->"+ message );
        kafkaTemplate.send("sp", "demo");
    }
}
