package com.ty.manytomany_uni.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Customer {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int cid;
private String name;
private long mno;
private String address;

@ManyToMany(cascade=CascadeType.ALL)
private List<Product>product;

/**
 * @return the cid
 */
public int getCid() {
	return cid;
}

/**
 * @param cid the cid to set
 */
public void setCid(int cid) {
	this.cid = cid;
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
 * @return the mno
 */
public long getMno() {
	return mno;
}

/**
 * @param mno the mno to set
 */
public void setMno(long mno) {
	this.mno = mno;
}

/**
 * @return the address
 */
public String getAddress() {
	return address;
}

/**
 * @param address the address to set
 */
public void setAddress(String address) {
	this.address = address;
}

/**
 * @return the product
 */
public List<Product> getProduct() {
	return product;
}

/**
 * @param product the product to set
 */
public void setProduct(List<Product> product) {
	this.product = product;
}

@Override
public String toString() {
	return "Customer [cid=" + cid + ", name=" + name + ", mno=" + mno + ", address=" + address + "]";
}





}
