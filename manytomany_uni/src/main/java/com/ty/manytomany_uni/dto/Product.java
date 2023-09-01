package com.ty.manytomany_uni.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
private String name;
private double price;
private int qty;



/**
 * @return the id
 */
public int getId() {
	return id;
}

/**
 * @param id the id to set
 */
public void setId(int id) {
	this.id = id;
}

/**
 * @return the name
 */
public String getName() {
	return name;
}

/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}

/**
 * @return the price
 */
public double getPrice() {
	return price;
}

/**
 * @param price the price to set
 */
public void setPrice(double price) {
	this.price = price;
}

/**
 * @return the qty
 */
public int getQty() {
	return qty;
}

/**
 * @param qty the qty to set
 */
public void setQty(int qty) {
	this.qty = qty;
}

@Override
public String toString() {
	return "Product [id=" + id + ", name=" + name + ", price=" + price + ", qty=" + qty + "]";
}





	
	
}
