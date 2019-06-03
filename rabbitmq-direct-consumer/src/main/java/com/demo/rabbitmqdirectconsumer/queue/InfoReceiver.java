package com.demo.rabbitmqdirectconsumer.queue;

import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(bindings = @QueueBinding(
        value = @Queue(value = "${mq.config.queue.info}", autoDelete = "false"),
        key = "${mq.config.queue.info.routing.key}",
        exchange = @Exchange(value = "${mq.config.exchange}", type = ExchangeTypes.DIRECT)

))
public class InfoReceiver {

    @RabbitHandler
    public void receiver(String msg) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("接受到的 info 日志 = > " + msg);
    }
}
