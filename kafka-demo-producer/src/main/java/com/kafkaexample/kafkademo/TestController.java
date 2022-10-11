package com.kafkaexample.kafkademo;

import com.kafkaexample.kafkademo.config.Producer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class TestController {

    private final Producer p;

    @GetMapping(value = "/send")
    public void send(){
        p.send("This is a test");
    }
}