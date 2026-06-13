package com.scm.boo.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.FileSystemResource;

import com.scm.boo.beans.WishMessageGenerator;

public class WishMessageGeneratorTest {

	public static void main(String[] args) {
		System.out.println("inside main method");

		// 1. Instantiate IOC container object
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(new FileSystemResource("src/main/java/com/scm/boo/config/applicationContext.xml"));

		// 2. Get Target class object from IOC container
		Object obj = factory.getBean("wmg");

		// 3. Downcasting an obj object to get it's sub class object.
		WishMessageGenerator wishMessageGenerator = (WishMessageGenerator) obj;

		// 4. Invoke the b.method of Target class
		String wishMessage = wishMessageGenerator.generateWishMessage("BooBoo");

		// 5. Print the wish message
		System.out.println(wishMessage);

		System.out.println("main method execution completed");
	}

}
