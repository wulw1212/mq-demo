/*
package com.example.rabbitmqtopicprovider;

import com.example.rabbitmqtopicprovider.queue.OrderSender;
import com.example.rabbitmqtopicprovider.queue.ProductSender;
import com.example.rabbitmqtopicprovider.queue.UserSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = com.example.rabbitmqtopicprovider.RabbitmqTopicProviderApplication.class)
public class RabbitmqTopicProviderApplicationTests {

    @Autowired
    private UserSender userSender;

    @Autowired
    private ProductSender productSender;

    @Autowired
    private OrderSender orderSender;

    @Test
    public void contextLoads() {
        userSender.sender();
        productSender.sender();
        orderSender.sender();
    }

}
*/
