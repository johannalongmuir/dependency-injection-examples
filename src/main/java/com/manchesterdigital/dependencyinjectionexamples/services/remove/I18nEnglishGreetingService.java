package com.manchesterdigital.dependencyinjectionexamples.services.remove;

import com.manchesterdigital.dependencyinjectionexamples.services.GreetingService;

//@Profile("EN")
//@Service("i18nService")
public class I18nEnglishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}
