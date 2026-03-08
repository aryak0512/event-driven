package com.aryak.eventdriven;

import com.aryak.eventdriven.sec01.Section01Runner;
import org.springframework.boot.SpringApplication;

public class TestEventDrivenApplication {

    public static void main(String[] args) {
        SpringApplication.from(Section01Runner::main).with(TestcontainersConfiguration.class).run(args);
    }

}
