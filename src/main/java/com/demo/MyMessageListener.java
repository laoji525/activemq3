package com.demo;

import cn.hutool.core.util.RandomUtil;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

public class MyMessageListener implements MessageListener {

    String name = "consumer-" + RandomUtil.randomString(5);

    public MyMessageListener(){
        System.out.println(name + " started");
    }

    public void onMessage(Message message){
        TextMessage textMessage = (TextMessage) message;

        try {
            System.out.println(name + " receive message: " + textMessage.getText());
        }catch (JMSException e){
            e.printStackTrace();
        }
    }
}
