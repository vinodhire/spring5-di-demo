package com.vinod.didemo.services;

import com.vinod.didemo.repository.GreetingRepository;

public class GreetingServiceFactory  {

    private GreetingRepository greetingRepository;

    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingService getGreetingService(String lang){
        GreetingService greetingService = null;
        switch (lang){
            case "es":
                greetingService= new PrimarySpanishGreetingService(greetingRepository);
                break;
            case "hi":
                greetingService = new PrimaryHindiGreetingService(greetingRepository);
                break;
            case "en":
            default:
                greetingService = new PrimaryGreetingService(greetingRepository);
        }
        return greetingService;
    }
}
