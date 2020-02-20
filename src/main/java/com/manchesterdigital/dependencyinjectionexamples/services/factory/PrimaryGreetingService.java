package com.manchesterdigital.dependencyinjectionexamples.services.factory;

import com.manchesterdigital.dependencyinjectionexamples.services.GreetingService;

public class PrimaryGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public PrimaryGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getEnglishGreeting();
    }
}