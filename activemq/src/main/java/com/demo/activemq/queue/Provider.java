package com.demo.activemq.queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

import javax.jms.Destination;

@Service
public class Provider {

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    public void sender(Destination destination,String msg){
        jmsMessagingTemplate.convertAndSend(destination,msg);
    }


}
