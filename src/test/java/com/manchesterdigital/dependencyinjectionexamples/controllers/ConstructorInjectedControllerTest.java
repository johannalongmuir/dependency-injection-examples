package com.manchesterdigital.dependencyinjectionexamples.controllers;

import com.manchesterdigital.dependencyinjectionexamples.services.GreetingServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        String greeting = controller.getGreeting();
        Assertions.assertThat(greeting).isEqualTo("Hello World");
    }
}