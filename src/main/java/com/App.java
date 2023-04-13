package com;

import java.awt.Container;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.controller.AddressController;
import com.controller.UserController;
import com.dao.AddressDao;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("spring.xml");
		System.out.println(container);

		UserController userController1 = container.getBean("userController", UserController.class);
		UserController userController2 = container.getBean("userController", UserController.class);
		UserController userController3 = container.getBean("userController", UserController.class);
		AddressDao addressDao = container.getBean("addressDao", AddressDao.class);
//       AddressController addressController1=container.getBean("addressController",AddressController.class);

		System.out.println(userController1);
		System.out.println(userController2);
		System.out.println(userController3);
		System.out.println(addressDao);
//       System.out.println(addressController1);

		System.out.println(userController1.getName());
		System.out.println(userController1.getSalary());
		System.out.println(addressDao.getCity());
		System.out.println(addressDao.getCountry());
//       System.out.println(addressController1.getAddressDao());
//       System.out.println(addressController1.getCountryDao());

		container.registerShutdownHook();

	}
}
