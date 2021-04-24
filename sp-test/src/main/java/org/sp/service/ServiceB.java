package org.sp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
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
