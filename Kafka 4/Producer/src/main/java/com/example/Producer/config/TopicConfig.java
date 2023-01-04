package com.example.Producer.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class TopicConfig {

    private String topicName="topic1";
    private String topicName2="topic2";


    @Bean
    public NewTopic topic(){

        return TopicBuilder.name(topicName)
                .partitions(1)
                .replicas(1)
                .build();
    }

    @Bean
    public NewTopic topic2(){

        return TopicBuilder.name(topicName2)
                .partitions(1)
                .replicas(1)
                .build();
    }


}
