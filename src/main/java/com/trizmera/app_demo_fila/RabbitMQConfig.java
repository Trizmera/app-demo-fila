package com.trizmera.app_demo_fila;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    @Bean
    public Queue demoQueue() {
        return new Queue("demo_queue", false);
    }
}
