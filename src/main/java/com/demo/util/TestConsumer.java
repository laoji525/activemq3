package com.demo.util;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.swing.*;
import java.io.IOException;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring_jms.xml")
public class TestConsumer {

    @Before
    public void checkServer(){
        ActiveMQUtil.checkServer();
    }

    @Test
    public void test(){
        try {
            System.in.read();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
