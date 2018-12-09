package pl.dawydiuk.Warehouse.kafka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class Consumer {

    @KafkaListener(topics = "${app.topic.mass}")
    public void listen(@Payload String message) {
        log.info("received message='{}'", message);
     }

}
