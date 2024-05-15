package com.pizzaEsercizio.u5_w1_d1;

import com.pizzaEsercizio.u5_w1_d1.appConfig.AppConfig;
import com.pizzaEsercizio.u5_w1_d1.bean.Bevande;
import com.pizzaEsercizio.u5_w1_d1.bean.Pizza;
import com.pizzaEsercizio.u5_w1_d1.bean.Toppings;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class U5W1D1Application {

	public static void main(String[] args) {
		SpringApplication.run(U5W1D1Application.class, args);
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		Pizza pizza = ctx.getBean(Pizza.class);
		System.out.println(pizza);

		Bevande bevande = ctx.getBean(Bevande.class);
		System.out.println(bevande);

		Toppings toppings = ctx.getBean(Toppings.class);
		System.out.println(toppings);


	}

}
