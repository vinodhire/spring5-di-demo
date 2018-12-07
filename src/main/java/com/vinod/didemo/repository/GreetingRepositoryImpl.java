package com.vinod.didemo.repository;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements  GreetingRepository {

    @Override
    public String getEnglishGreeting() {
        return "Hello - Primary Greeting Service";
    }

    @Override
    public String getSpanishGreeting() {
        return "Servicido de Saludo Primario";
    }

    @Override
    public String getHindiGreeting() {
        return "Namaskar - Hindi Greeting Service";
    }
}
