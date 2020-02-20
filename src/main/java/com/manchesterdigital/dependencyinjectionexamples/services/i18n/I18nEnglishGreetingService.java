package com.manchesterdigital.dependencyinjectionexamples.services.i18n;

import com.manchesterdigital.dependencyinjectionexamples.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("i18nService")
@Profile(value = "inen")
public class I18nEnglishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}
