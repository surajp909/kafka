package com.demo.kafkaController;

import com.demo.kafkaProducer.KafkaProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/kafka")
public class KafkaController {

    private KafkaProducer kafkaproducer;
    KafkaController(KafkaProducer kafkaproducer)
    {
        this.kafkaproducer=kafkaproducer;
    }

    @GetMapping("/publish")
    public ResponseEntity<String> publish(@RequestParam("message") String message)
    {
        System.out.println("IN REST");
        kafkaproducer.sendMessage(message);
        return ResponseEntity.ok("message send to kafka sp topic successfully");
    }
}
