package com.demo.rabbitmqdirectprovider.queue;

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

    @Value("${mq.config.queue.info.routing.key}")
    private String infoRoute;

    @Value("${mq.config.queue.error.routing.key}")
    private String errorRouter;

    public void sender() {
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            String msg = "self = > " + new Date();
            amqpTemplate.convertAndSend(this.exchange, this.infoRoute," info = "+ msg);
        }

        /*amqpTemplate.convertAndSend(this.exchange, this.errorRouter," error = "+ msg);
        amqpTemplate.convertAndSend(this.exchange, this.infoRoute," info = "+ msg);
        amqpTemplate.convertAndSend(this.exchange, this.errorRouter," error = "+ msg);*/
    }
}
