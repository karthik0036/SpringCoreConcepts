package com.example.springconcepts;

import com.example.springconcepts.component.DemoBean;
import com.example.springconcepts.controller.HelloRestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringconceptsApplication {

	public static void main(String[] args) {
		System.out.println("Welcome to spring concepts");
		ApplicationContext context = SpringApplication.run(SpringconceptsApplication.class, args);
		DemoBean demoBean = context.getBean(DemoBean.class);
		System.out.println("Demo Bean = "+demoBean.toString());
		System.out.println(context.getBean(HelloRestController.class));
	}

}
