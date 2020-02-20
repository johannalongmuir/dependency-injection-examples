package com.manchesterdigital.dependencyinjectionexamples;

import com.manchesterdigital.dependencyinjectionexamples.controllers.*;
import com.manchesterdigital.dependencyinjectionexamples.controllers.i18n.I18nController;
import com.manchesterdigital.dependencyinjectionexamples.examplebeans.FakeDataSource;
import com.manchesterdigital.dependencyinjectionexamples.examplebeans.FakeJmsBoker;
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
		System.out.println(ctx.getBean(I18nController.class).sayHello());

		PetController petController = ctx.getBean("petController", PetController.class);
		System.out.println("--- The Best Pet is ---");
		System.out.println(petController.whichPetIsTheBest());

		System.out.println("---Datasource.properties file---");
		FakeDataSource fakeDataSource = ctx.getBean(FakeDataSource.class);
		System.out.println(fakeDataSource.getUsername());
		System.out.println(fakeDataSource.getPassword());

		System.out.println("---jms.properties file---");
		FakeJmsBoker fakeJmsBoker = ctx.getBean(FakeJmsBoker.class);
		System.out.println(fakeJmsBoker.getUsername());


	}
}
