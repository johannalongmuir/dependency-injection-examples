package com.manchesterdigital.dependencyinjectionexamples.services.factory;

import com.manchesterdigital.dependencyinjectionexamples.services.GreetingService;

public class PrimaryGermanGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public PrimaryGermanGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getGermanGreeting();
    }
}
