package com.trizmera.app_demo_fila;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @Autowired
    private MessageProducer messageProducer;

    @GetMapping("/envia")
    public String sendMessage(@RequestParam String message) {
        messageProducer.sendMessage(message);
        return "Message enviada:.. " + message;
    }
}
