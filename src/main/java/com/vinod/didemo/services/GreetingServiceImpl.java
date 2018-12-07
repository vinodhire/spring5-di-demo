package com.vinod.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    public static String MSG = "Hello Gurus !!";

    @Override
    public String sayGreeting() {
        return MSG;
    }
}
