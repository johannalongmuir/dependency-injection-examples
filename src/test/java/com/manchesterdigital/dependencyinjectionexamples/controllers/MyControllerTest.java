package com.manchesterdigital.dependencyinjectionexamples.controllers;

import com.manchesterdigital.dependencyinjectionexamples.services.factory.GreetingRepository;
import com.manchesterdigital.dependencyinjectionexamples.services.factory.PrimaryGreetingService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class MyControllerTest {

    private GreetingRepository greetingRepository = mock(GreetingRepository.class);
    MyController controller;

    @BeforeEach
    void setUp() {
        controller = new MyController(new PrimaryGreetingService(greetingRepository));
    }

    @Test
    void getGreeting() {
        when(greetingRepository.getEnglishGreeting()).thenReturn("Hello World!!! - Primary Greeting");
        String greeting = controller.sayHello();
        Assertions.assertThat(greeting).isEqualTo("Hello World!!! - Primary Greeting");
    }

}