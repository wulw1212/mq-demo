/*
package com.demo.rabbitmqdirectconsumer.queue;

import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(bindings = @QueueBinding(
        value = @Queue(value = "${mq.config.queue.error}", autoDelete = "true"),
        key = "${mq.config.queue.error.routing.key}",
        exchange = @Exchange(value = "${mq.config.exchange}", type = ExchangeTypes.DIRECT)

))
public class ErrorReceiver {

    @RabbitHandler
    public void receiver(String msg) {
        System.out.println("接受到的 error 日志 = > " + msg);
    }
}
*/
