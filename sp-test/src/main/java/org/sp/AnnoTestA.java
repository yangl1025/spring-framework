package org.sp;

import org.sp.config.AppConfig;
import org.sp.service.ServiceA;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnoTestA {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		ServiceA serviceA = ac.getBean(ServiceA.class);
		serviceA.callB();
	}
}
