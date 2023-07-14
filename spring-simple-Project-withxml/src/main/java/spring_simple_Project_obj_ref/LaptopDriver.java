package spring_simple_Project_obj_ref;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaptopDriver {
	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("student.xml");
		Laptop laptop = (Laptop) applicationContext.getBean("myLaptop");
		laptop.laptopName();
	}

}
