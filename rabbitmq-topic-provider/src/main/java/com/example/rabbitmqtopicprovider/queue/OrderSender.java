package com.example.rabbitmqtopicprovider.queue;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class OrderSender {

    @Autowired
    private AmqpTemplate amqpTemplate;


    @Value("${mq.config.exchange}")
    private String exchange;

    @Value("${mq.order.config.queue.info.routing.key}")
    private String infoRoute;

    @Value("${mq.order.config.queue.error.routing.key}")
    private String errorRouter;

    @Value("${mq.order.config.queue.debug.routing.key}")
    private String debugRoute;

    @Value("${mq.order.config.queue.warn.routing.key}")
    private String warnRoute;

    public void sender() {
        String msg = "self = > " + new Date();
        amqpTemplate.convertAndSend(this.exchange, this.infoRoute, "order info = " + msg);
        amqpTemplate.convertAndSend(this.exchange, this.errorRouter, "order error = " + msg);
        amqpTemplate.convertAndSend(this.exchange, this.debugRoute, "order debug = " + msg);
        amqpTemplate.convertAndSend(this.exchange, this.warnRoute, "order warn = " + msg);
    }
}
