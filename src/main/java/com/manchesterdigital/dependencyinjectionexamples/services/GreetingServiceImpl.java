package com.manchesterdigital.dependencyinjectionexamples.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String ORIGINAL_HELLO = "Hellooooooo! ";

    @Override
    public String sayGreeting() {
        return ORIGINAL_HELLO;
    }
}
