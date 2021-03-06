package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.*;
import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/*
Ukazka
1. jak rucne ziskat komponentu ze Spring contextu (MyController)
2. fungovani jednotlivych typu DI ve Springu (PropertyInjectedController, SetterInjectedController, ConstructorInjectedController)
 */

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		MyController myC = (MyController)ctx.getBean("customName");
		String greeting = myC.sayHello();
		System.out.println(greeting);

		System.out.println("--- DI using Property ---");
		PropertyInjectedController pc = (PropertyInjectedController)ctx.getBean("propertyInjectedController");
		System.out.println(pc.getGreeting());

		System.out.println("--- DI using Setter ---");
		SetterInjectedController sc = (SetterInjectedController)ctx.getBean("setterInjectedController");
		System.out.println(sc.getGreeting());

		System.out.println("--- DI using Constructor ---");
		ConstructorInjectedController cc = (ConstructorInjectedController)ctx.getBean("constructorInjectedController");
		System.out.println(cc.getGreeting());

		System.out.println("--- DI using Constructor with defined Primary Bean ---");
		PrimaryController prim = (PrimaryController)ctx.getBean("primaryController");
		System.out.println(prim.getGreeting());

		System.out.println("---");
		I18nController ic = (I18nController)ctx.getBean("i18nController");
		System.out.println(ic.getGreeting());

		System.out.println("---");
		GreetingService gc = (GreetingService)ctx.getBean("johnGreetingServiceImpl");
		System.out.println(gc.sayGreeting());
 	}

}
