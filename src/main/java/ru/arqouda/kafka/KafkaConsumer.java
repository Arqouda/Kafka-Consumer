package ru.arqouda.kafka;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    private static final Logger log = LogManager.getLogger(KafkaConsumer.class);

    @KafkaListener(topics = "arqouda", groupId = "my_consumer")
    public void listener(String message) {
        System.out.println("Received message = " + message);
        log.info("Received message = " + message);
    }
}
