package com.manchesterdigital.dependencyinjectionexamples.services.i18n;


import com.manchesterdigital.dependencyinjectionexamples.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile(value = "ines")
@Service("i18nService")
public class I18NSpanishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }
}
