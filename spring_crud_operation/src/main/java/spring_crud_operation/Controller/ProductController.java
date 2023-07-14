package spring_crud_operation.Controller;
 
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring_crud_operation.Myconfig;
import spring_crud_operation.Dao.ProductDao;
import spring_crud_operation.Service.ProductService;
import spring_crud_operation.dto.Product;

public class ProductController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Myconfig.class);
		ProductService productService = (ProductService)applicationContext.getBean("productService");
		Product product =(Product)applicationContext.getBean("product");
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter product id");
		int id = scanner.nextInt();
		System.out.println("enter the product name");
		String name = scanner.next();
		System.out.println("enter the product price ");
		double price = scanner.nextDouble();
		product.setId(id);
		product.setName(name);
		product.setPrice(price);
		
		productService.saveProduct(product);
	}

}
