package com.example.Consumer2.listne;



import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "topic1", groupId = "group2")
    public void consume(String message){

        System.out.println(message);


    }
}
