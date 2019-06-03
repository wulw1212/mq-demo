package com.demo.rabbitfanoutprovider.queue;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Sender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    @Value("${mq.config.exchange}")
    private String exchange;


    public void sender() {
        String msg = "  fanout = >" + new Date();
        amqpTemplate.convertAndSend(exchange, "", msg);
    }

}
