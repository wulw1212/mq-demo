package com.demo.rabbitmqfanoutconsumer.queue;


import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(bindings = @QueueBinding(
        value = @Queue(value="${mq.config.queue.red}",autoDelete = "true"),
        exchange = @Exchange(value = "${mq.config.exchange}",type = ExchangeTypes.FANOUT)
))
public class RedReceiver {

    @RabbitHandler
    public void receiver(String msg){
        System.out.println("red = > "+ msg);
    }
}
