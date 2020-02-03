package com.manchesterdigital.dependencyinjectionexamples;

import com.manchesterdigital.dependencyinjectionexamples.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionExamplesApplication {

	public static void main(String[] args) {
//		SpringApplication.run(DependencyInjectionExamplesApplication.class, args);

		ApplicationContext ctx = SpringApplication.run(DependencyInjectionExamplesApplication.class, args);
		MyController myController = (MyController) ctx.getBean("myController");
		String greeting = myController.sayHello();
		System.out.println(greeting);
	}

}
