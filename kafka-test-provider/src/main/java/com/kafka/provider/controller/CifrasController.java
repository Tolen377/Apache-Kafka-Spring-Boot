package com.kafka.provider.controller;

import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cifras")
public class CifrasController {
   @Autowired
   private KafkaTemplate<String, String> kafkaTemplate;

   @GetMapping
   public ResponseEntity<?> getCifras() {
       kafkaTemplate.send("cifras", "Luis es gay");
       return new ResponseEntity<>("TODO BIEN", HttpStatus.OK);
   }

}
