package com.aryak.eventdriven;

import org.springframework.boot.SpringApplication;

public class TestEventDrivenApplication {

    public static void main(String[] args) {
        SpringApplication.from(EventDrivenApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
