package com.mancash.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

import com.mancash.beans.WishMessageGenerator;

public class WishMessageGeneratorTest {

	public static void main(String[] args) {
		System.out.println("INSIDE MAIN METHOD");
		// 1. Create IOC container
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(new ClassPathResource("applicationContext.xml"));

		// 2. Invoke getBean(-) by passing corresponding spring bean class beanId
		Object obj = factory.getBean("wmg");

		// 3. Get the WishMessageGenerator class object from Object class via
		// down-casting
		WishMessageGenerator wishMessageGenerator = (WishMessageGenerator) obj;

		// 4. Invoke the b.method
		String wishMessage = wishMessageGenerator.generateWishMessage("BooBoo");

		// 5. Print the wish message
		System.out.println(wishMessage);

		System.out.println("ABOUT TO COMPLETE MAIN METHOD");
	}

}
