package com.ty.manytomany_uni.controller;

import java.util.ArrayList;
import java.util.List;

import com.ty.manytomany_uni.dao.Customer_Product_Dao;
import com.ty.manytomany_uni.dto.Customer;
import com.ty.manytomany_uni.dto.Product;

public class Customer_Product_Controller {
public static void main(String[] args) {
	Customer customer=new Customer();
	customer.setName("Swapnali");
	customer.setMno(5444343);
	customer.setAddress("Bangalore");
	
	Customer customer1=new Customer();
	customer1.setName("Monika");
	customer1.setMno(86544343);
	customer1.setAddress("Gangtok");
	
	Customer customer2=new Customer();
	customer2.setName("Ankita");
	customer2.setMno(5654443);
	customer2.setAddress("Pune");
	
	Product product=new Product();
	product.setName("Phone");
	product.setPrice(30000);
	product.setQty(2);
	
	Product product1=new Product();
	product1.setName("MotherBoard");
	product1.setPrice(780000);
	product1.setQty(5);
	
	Product product2=new Product();
	product2.setName("Laptop");
	product2.setPrice(80000);
	product2.setQty(1);
	
	List<Product>list=new ArrayList<Product>();
	list.add(product);
	list.add(product1);
	list.add(product2);
	
	customer.setProduct(list);
	customer1.setProduct(list);
	customer2.setProduct(list);
	
	Customer_Product_Dao dao=new Customer_Product_Dao();
//	dao.saveCustomer(customer);
//	dao.saveCustomer(customer1);
//	dao.deleteProduct(10);
//	dao.findAllCustomer(customer1);
//	dao.updateProduct(product1);
//	dao.removeCustomerById(9, 12);
	
}
}
