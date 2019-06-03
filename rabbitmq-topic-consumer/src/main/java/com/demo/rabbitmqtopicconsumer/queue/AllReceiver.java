/*
package com.demo.rabbitmqtopicconsumer.queue;

import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(bindings = @QueueBinding(
        value = @Queue(value = "${mq.config.queue.all}", autoDelete = "true"),
        key = "*.log.*",
        exchange = @Exchange(value = "${mq.config.exchange}", type = ExchangeTypes.TOPIC)

))
public class AllReceiver {

    @RabbitHandler
    public void receiver(String msg) {
        System.out.println("接受到的 all 日志 = > " + msg);
    }
}
*/
