package com.demo.kafkaTopic;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class kafkaTopicConfig {

    @Bean
    public NewTopic topicConfig()
    {
        return TopicBuilder.name("sp").build();
    }
}
