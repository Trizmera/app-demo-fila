package com.trizmera.app_demo_fila;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    @RabbitListener(queues = "demo_queue")
    public void listen(String message) {
        System.out.println("Recebida:.. " + message);
    }
}
