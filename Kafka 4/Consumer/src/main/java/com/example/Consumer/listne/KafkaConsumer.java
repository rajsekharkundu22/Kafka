package com.example.Consumer.listne;


import com.example.Consumer.model.Employee;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "topic1", groupId = "group1")
    public void consume(String message) {

        System.out.println(message);

//        ObjectMapper mapper = new ObjectMapper();
//        try {
//            Employee employee = mapper.readValue(message, Employee.class);
//
//            System.out.println(employee.getEmpName());
//            System.out.println(employee.getEmpCity());
//        }catch (Exception e) {
//            e.printStackTrace();
//        }
    }

    @KafkaListener(topics = "topic2", groupId = "group1")
    public void consume1(String message) {

        System.out.println(message);
    }
}
