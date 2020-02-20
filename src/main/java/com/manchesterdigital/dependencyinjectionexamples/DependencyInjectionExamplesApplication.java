package com.manchesterdigital.dependencyinjectionexamples;

import com.manchesterdigital.dependencyinjectionexamples.controllers.MyController;
import com.manchesterdigital.dependencyinjectionexamples.controllers.ConstructorInjectedController;
import com.manchesterdigital.dependencyinjectionexamples.controllers.PropertyInjectedController;
import com.manchesterdigital.dependencyinjectionexamples.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionExamplesApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DependencyInjectionExamplesApplication.class, args);

		MyController controller = (MyController) ctx.getBean("myController");

		System.out.println(controller.sayHello());
		System.out.println(ctx.getBean(PropertyInjectedController.class).getGreeting());
		System.out.println(ctx.getBean(SetterInjectedController.class).getGreeting());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).getGreeting());
	}
}
