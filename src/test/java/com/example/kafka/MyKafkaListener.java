package com.example.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.concurrent.CountDownLatch;

@Service
public class MyKafkaListener {

    public final CountDownLatch latch1 = new CountDownLatch(1);

    @KafkaListener(id = "foo", topics = "kafka-sample")
    public void listen1(String value) {
        System.out.println("Received : " + value);
        this.latch1.countDown();
    }
}
