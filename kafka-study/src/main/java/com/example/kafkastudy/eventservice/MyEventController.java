package com.example.kafkastudy.eventservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyEventController {

    private final MyEventService myEventService;

    public MyEventController(MyEventService myEventService) {
        this.myEventService = myEventService;
    }

    @GetMapping("/event")
    public String sendMyEvent() {
        myEventService.sendMsg();
        return "ok";
    }
}
