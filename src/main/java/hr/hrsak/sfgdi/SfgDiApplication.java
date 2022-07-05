package hr.hrsak.sfgdi;

import hr.hrsak.sfgdi.controllers.ConstructorInjectedController;
import hr.hrsak.sfgdi.controllers.MyController;
import hr.hrsak.sfgdi.controllers.PropertyInjectedController;
import hr.hrsak.sfgdi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		MyController myController = (MyController) ctx.getBean(MyController.class);
		String greeting = myController.sayHello();

		System.out.println(greeting);
		System.out.println("--------Property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean(PropertyInjectedController.class);
		System.out.println(propertyInjectedController.getGreeting());

		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean(SetterInjectedController.class);
		System.out.println(setterInjectedController.getGreeting());

		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean(ConstructorInjectedController.class);
		System.out.println(constructorInjectedController.getGreeting());
	}

}
