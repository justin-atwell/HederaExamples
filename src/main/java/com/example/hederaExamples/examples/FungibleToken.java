package com.example.hederaExamples.examples;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import io.github.cdimascio.dotenv.Dotenv;

@Component
public class FungibleToken {

    @EventListener(ApplicationReadyEvent.class)
    public void doItBoy(){
        System.out.println("show me");
    }
}
