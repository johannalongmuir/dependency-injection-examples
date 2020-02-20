package com.manchesterdigital.dependencyinjectionexamples.services.remove;


import com.manchesterdigital.dependencyinjectionexamples.services.GreetingService;

//@Profile({"ES", "default"})
//@Service("i18nService")
public class I18NSpanishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }
}
