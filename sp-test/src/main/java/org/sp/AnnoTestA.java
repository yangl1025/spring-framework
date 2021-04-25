package org.sp;

import org.sp.config.AppConfig;
import org.sp.service.ServiceA;
import org.sp.service.ServiceB;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class AnnoTestA {
	public static void main(String[] args) {
		Class<ServiceB> serviceBClass = ServiceB.class;
		System.out.println(serviceBClass);
		System.out.println(serviceBClass.getName());
		System.out.println(Arrays.toString(serviceBClass.getAnnotations()));
		System.out.println(Arrays.toString(serviceBClass.getConstructors()));
		System.out.println(Arrays.toString(serviceBClass.getFields()));
		try {
			serviceBClass.newInstance().callA();
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
//		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext("org.sp");
		ac.getBean(ServiceA.class).callB();
	}
}
