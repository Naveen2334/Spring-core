package spring_crud_operation.Service;

import org.springframework.beans.factory.annotation.Autowired;

//import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

import spring_crud_operation.Dao.ProductDao;
import spring_crud_operation.dto.Product;
// ???why we use it here 
@Component(value = "productService")
public class ProductService {
	@Autowired
	ProductDao productDao;
	
	// SAVE METHOD
	public Product saveProduct(Product product)
	{
		return productDao.saveProduct(product);
	}
	

}
