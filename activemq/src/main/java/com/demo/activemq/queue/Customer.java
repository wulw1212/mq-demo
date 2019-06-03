package com.demo.activemq.queue;


import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Customer {


    @JmsListener(destination = "mytest.queue")
    public void receiver(String msg){
        System.out.println(msg);
    }

}
