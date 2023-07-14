package spring_crud_operation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

public class Myconfig {
	@Configuration
	@ComponentScan(value = "spring_crud_operation")
	public class MyConfig {

	}
}
