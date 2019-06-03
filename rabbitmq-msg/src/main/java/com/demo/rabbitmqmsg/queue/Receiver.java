package com.demo.rabbitmqmsg.queue;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {



    @RabbitListener(queues = "hello_queue_myQueue")
    public void receiver(String msg){
        System.out.println(msg);
    }
}
