package com.demo.rabbitmqmsg.queue;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyQueue {

    @Bean
    public Queue queue(){

        return new Queue("hello_queue_myQueue");
    }

}
