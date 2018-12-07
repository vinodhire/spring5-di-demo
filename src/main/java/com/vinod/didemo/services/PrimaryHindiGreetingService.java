package com.vinod.didemo.services;

import com.vinod.didemo.repository.GreetingRepository;

/*@Service
@Primary
@Profile("hi")*/
public class PrimaryHindiGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public PrimaryHindiGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getHindiGreeting();
    }
}
