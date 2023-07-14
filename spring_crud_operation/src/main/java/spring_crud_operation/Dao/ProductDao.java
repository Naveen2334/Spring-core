package spring_crud_operation.Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import spring_crud_operation.dto.Product;

public class ProductDao {
	EntityManager entityManager = Persistence.createEntityManagerFactory("ansari").createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	/*
	 * save method
	 */
	public Product saveProduct(Product product)
	{
		entityTransaction.begin();
		entityManager.persist(product);
		entityTransaction.commit();
		System.out.println("data stored sucessfully");
		return product;
	}

}
