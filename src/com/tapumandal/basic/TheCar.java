package com.tapumandal.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TheCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("car_bean.xml");
		
		Chassis chassis = (Chassis) context.getBean("chassis");
		chassis.theChassis();
	}

}