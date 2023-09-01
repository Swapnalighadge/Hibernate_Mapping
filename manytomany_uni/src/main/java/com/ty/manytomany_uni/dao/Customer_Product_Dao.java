package com.ty.manytomany_uni.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;



import com.ty.manytomany_uni.dto.Customer;
import com.ty.manytomany_uni.dto.Product;



public class Customer_Product_Dao {
	private EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("dev");
	 private  EntityManager manager= entityManagerFactory.createEntityManager();
	 private  EntityTransaction transaction= manager.getTransaction();
	  
	  public void saveCustomer(Customer customer) {
		  transaction.begin();
		  manager.persist(customer);
		  transaction.commit();
	  }
	  
	  public void updateCustomer (Customer  customer ) {
		  transaction.begin();
		  manager.merge(customer);
		  transaction.commit();
	  }
	  public void updateProduct(Product product) {
		  transaction.begin();
		  manager.merge( product);
		  transaction.commit();
	  }
	  
	  
	  public void deleteCustomer(int id) {
		  Customer customer =manager.find(Customer.class,id);
		  customer.setProduct(null);
		  
		  transaction.begin();
		  manager.remove(customer);
		  transaction.commit();
	  }
	  
	  public void deleteProduct(int id) {
		  Product product=manager.find(Product.class,id);
		  if(product!=null) {
			  List<Customer> customers=manager.createQuery("from Customer").getResultList();
			  for(Customer customer:customers) {
				  if(customer.getProduct().contains(product)) {
					  customer.getProduct().remove(product);
				  }
			  }
			  transaction.begin();
			  manager.remove(product);
			  transaction.commit();
		  }
	  }
	  
	  public void removeCustomerById(int cid,int pid ) {
		  Customer customer=manager.find(Customer.class,cid);
		  List<Product>product=customer.getProduct();
		  Product p1=manager.find(Product.class, pid);
		  
		  if(product.contains(p1)) {
			  product.remove(p1);
		  }
		  customer.setProduct(product);
		  transaction.begin();
		  manager.persist(customer);
		  transaction.commit();
		  
	  }
	  
	  public void findAllProduct(Product product) {
		  Query query =manager.createQuery("select a from Product a");
		  List<Product>list=query.getResultList();
		  System.out.println(list);
	  }
	  
	  public void findAllCustomer(Customer customer) {
		  Query query =manager.createQuery("select a from Customer a");
		  List<Customer>list=query.getResultList();
		  System.out.println(list);
	  }
	  
}
