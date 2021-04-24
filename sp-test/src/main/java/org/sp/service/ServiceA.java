package org.sp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServiceA {
	@Autowired
	private ServiceB serviceB;

	public ServiceA() {
		System.out.println("A 初始化");
	}

	public void callB(){
		serviceB.callA();
		System.out.println("A call B");
	}
}
