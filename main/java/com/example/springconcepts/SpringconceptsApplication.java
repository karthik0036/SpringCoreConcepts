package com.example.springconcepts;

import com.example.springconcepts.component.DemoBean;
import com.example.springconcepts.component.EmployeeBean;
import com.example.springconcepts.controller.HelloRestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringconceptsApplication {
	public static final Logger logger = LoggerFactory.getLogger(SpringconceptsApplication.class);

	public static void main(String[] args) {
		logger.debug("Welcome to spring concepts");
		ApplicationContext context = SpringApplication.run(SpringconceptsApplication.class, args);
		DemoBean demoBean = context.getBean(DemoBean.class);
		logger.debug("Demo Bean = "+demoBean.toString());
		System.out.println(context.getBean(HelloRestController.class));

		//dependency ingection
		EmployeeBean employeeBean = context.getBean(EmployeeBean.class);
		employeeBean.setEid(104);
		employeeBean.setEname("Spring FrameWork Guru");
		employeeBean.showEmployeeDetails();
	}

}
