package com.blusalt.customer.controller;

import com.blusalt.customer.model.Bill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@RestController
@RequestMapping("/api/customerAccount")
public class CustomerController {

    @Autowired
    RestTemplate restTemplate;
    @Value("${billingServiceUrl}")
    private String billingServiceUrl;

    @RequestMapping(value = "/fund", method = RequestMethod.POST)
    public String fundAccount(@RequestBody Bill bill){
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<Bill> entity = new HttpEntity<>(bill,headers);

        return restTemplate.exchange(billingServiceUrl, HttpMethod.POST, entity, String.class).getBody();
    }
}
