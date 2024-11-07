package com.example.hederaExamples.examples;

import com.hedera.hashgraph.sdk.AccountId;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import io.github.cdimascio.dotenv.Dotenv;

import java.util.Objects;

@Component
public class RetrieveAccountFromDotEnv {

    @EventListener(ApplicationReadyEvent.class)
    public void retrieveOperatorIdWithDotEnv(){

        AccountId OPERATOR_ID = AccountId.fromString(Objects.requireNonNull(Dotenv.load().get("OPERATOR_ID")));

        System.out.println(OPERATOR_ID);
    }
}
