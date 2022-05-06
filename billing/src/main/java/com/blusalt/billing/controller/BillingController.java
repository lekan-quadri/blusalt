package com.blusalt.billing.controller;

import com.blusalt.billing.model.Bill;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/billings")
public class BillingController {

    private KafkaTemplate<String, Bill> kafkaTemplate;

    public BillingController(KafkaTemplate<String, Bill> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @PostMapping
    public void publish(@RequestBody Bill bill){
        kafkaTemplate.send("bill",bill);
    }
}
