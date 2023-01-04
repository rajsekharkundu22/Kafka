package com.example.Producer.config;

import com.example.Producer.model.Employee;

import com.example.Producer.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

    private String topicName="topic1";
    private String topicName2="topic2";

//    @Autowired
//    private KafkaTemplate<String,String> kafkaTemplate;
//
////    public KafkaProducer(KafkaProducer<String,String> kafkaTemplate){
////        this.kafkaTemplate = kafkaTemplate;
////    }
//
//    public void sendMessage(String message){
//        kafkaTemplate.send(topicName, message);
//    }

    @Autowired
    private KafkaTemplate<String, ?> kafkaTemplate;

    public void sendMessage(Employee employee){
        Message<Employee> message= MessageBuilder
                .withPayload(employee)
                .setHeader(KafkaHeaders.TOPIC,topicName)
                .build();
        kafkaTemplate.send(message);

    }

    public void sendMessage1(User user){
        Message<User> message= MessageBuilder
                .withPayload(user)
                .setHeader(KafkaHeaders.TOPIC,topicName2)
                .build();
        kafkaTemplate.send(message);

    }



}
