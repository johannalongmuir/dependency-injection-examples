package com.manchesterdigital.dependencyinjectionexamples.config;

import com.manchesterdigital.dependencyinjectionexamples.examplebeans.FakeDataSource;
import com.manchesterdigital.dependencyinjectionexamples.examplebeans.FakeJmsBoker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PropertyConfig {
    @Value("${manchesterdigital.username}")
    String username;

    @Value("${manchesterdigital.password}")
    String password;

    @Value("${manchesterdigital.url}")
    String url;

    @Value("${manchesterdigital.jms.username}")
    String jmsusername;

    @Value("${manchesterdigital.jms.password}")
    String jmspassword;

    @Value("${manchesterdigital.jms.url}")
    String jmsurl;


    @Bean
    public FakeDataSource fakeDataSource(){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUsername(username); //uses the environment one over the props
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        return fakeDataSource;
    }

    @Bean
    public FakeJmsBoker fakeJmsBoker(){
        FakeJmsBoker fakeJmsBoker = new FakeJmsBoker();
        fakeJmsBoker.setUsername(jmsusername);
        fakeJmsBoker.setPassword(jmspassword);
        fakeJmsBoker.setUrl(jmsurl);
        return fakeJmsBoker;
    }

}
