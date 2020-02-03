package com.manchesterdigital.dependencyinjectionexamples.controllers;


import com.manchesterdigital.dependencyinjectionexamples.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }

}
