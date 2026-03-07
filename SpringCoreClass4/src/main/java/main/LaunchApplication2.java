package main;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import services.Telusko;

public class LaunchApplication2 {

	public static void main(String[] args) {
		
		
		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
		reader.loadBeanDefinitions("applicationconfig.xml");
		
		
		Telusko t = beanFactory.getBean(Telusko.class);
		Boolean status = t.buyTheCourse(444.4);
		
		if(status) {
			System.out.println("course purchased successfull");
		}
		else {
			System.out.println("something went wrong");
		}
		

	}

}
