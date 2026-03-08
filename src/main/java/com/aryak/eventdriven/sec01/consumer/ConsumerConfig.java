package com.aryak.eventdriven.sec01.consumer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Configuration
public class ConsumerConfig {

    @Bean
    public Consumer<String> consumer() {
        return System.out::println;
    }
}
