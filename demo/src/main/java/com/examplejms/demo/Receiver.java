package com.examplejms.demo;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {
    @JmsListener(destination = "messageBox", containerFactory = "myFactory")
    public void receiveMessage(Message message) {
        System.out.println("Received: " + message);
    }
}
