package org.sp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component(value = "serviceB")
@Lazy
public class ServiceB {
	@Autowired
	private ServiceA  serviceA;

	public ServiceB() {
		System.out.println("B 初始化");
	}

	public void callA(){
		System.out.println("B call A");
	}
}
