package com.manchesterdigital.dependencyinjectionexamples.controllers;

import com.manchesterdigital.dependencyinjectionexamples.services.PrimaryGreetingService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyControllerTest {

    MyController controller;

    @BeforeEach
    void setUp() {
        controller = new MyController(new PrimaryGreetingService());
    }

    @Test
    void getGreeting() {
        String greeting = controller.sayHello();
        Assertions.assertThat(greeting).isEqualTo("Hello World!!! - Primary Greeting");
    }

}