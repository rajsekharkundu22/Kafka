package com.example.Producer.controller;

import com.example.Producer.config.KafkaProducer;
import com.example.Producer.model.Employee;
import com.example.Producer.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kafka")
public class KafkaController {

    @Autowired
    private KafkaProducer kafkaProducer;

//    @GetMapping("/publish/{message}")
//    public ResponseEntity<String> publishMessage(@PathVariable("message") String message){
//
//        kafkaProducer.sendMessage(message);
//
//     return ResponseEntity.ok("Message sent");
//    }

    @PostMapping("/publish")
    public ResponseEntity<String> publishMessage(@RequestBody Employee employee){
        kafkaProducer.sendMessage(employee);
        return ResponseEntity.ok("Message sent");
    }

    @PostMapping("/publish1")
    public ResponseEntity<String> publishMessage1(@RequestBody User user){
        kafkaProducer.sendMessage1(user);
        return ResponseEntity.ok("Message sent");
    }


}
