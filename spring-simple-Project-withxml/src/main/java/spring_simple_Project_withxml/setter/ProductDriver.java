package spring_simple_Project_withxml.setter;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProductDriver {
	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("Student.xml");
		Object product =  applicationContext.getBean("proId");
		Product product2 = (Product)product;
		System.out.println(product2.getId());
		System.out.println(product2.getName());
		System.out.println(product2.getPrice());
		System.out.println(product2.getClass().getName());
		
	}

}
