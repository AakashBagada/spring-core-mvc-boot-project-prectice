package com.controller;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class UserController implements InitializingBean, DisposableBean {
	private String name;
	private Integer salary;

	public UserController() {
		System.out.println("userController()");
	}

	public void init() {
		System.out.println("init()");
	}

	public void destroy() {
		System.out.println("destroy()");
	}

	public void destroyME() {
		System.out.println("destroyMe()");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet()");

	}

}
