package com.ivs.common;

import com.ivs.config.MyBatisDbConfig;
import com.ivs.service.EmployeeService;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


public class ConfigApplicationContextBean {
	
	AbstractApplicationContext context = new AnnotationConfigApplicationContext(MyBatisDbConfig.class);

	public AbstractApplicationContext getAbstractApplicationContext() {
		if(context == null) {
			context = new AnnotationConfigApplicationContext(MyBatisDbConfig.class);
		}
		return context;
	}
	
	public EmployeeService getEmployeeService()
	{
		EmployeeService employeeService = (EmployeeService) getAbstractApplicationContext().getBean("EmployeeService");
		return employeeService;
	}
	
}
