package com.blusalt.worker.listener;

import com.blusalt.worker.model.Bill;
import com.blusalt.worker.repositories.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class KafkaBillListener {

    @Autowired
    private BillRepository billRepository;

    @KafkaListener(
            topics = "bill",
            groupId = "groupId"
    )
    void listener(Bill bill){
        takeCharge();
        bill.setStatus("success");
        billRepository.saveAndFlush(bill);
    }


    public void takeCharge(){
        try {
            TimeUnit.MILLISECONDS.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
