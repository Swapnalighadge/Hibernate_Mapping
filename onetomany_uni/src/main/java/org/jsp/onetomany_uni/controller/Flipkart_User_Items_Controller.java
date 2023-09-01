package org.jsp.onetomany_uni.controller;

import java.util.ArrayList;
import java.util.List;

import org.jsp.onetomany_uni.dao.Flipkart_User_Items_Dao;
import org.jsp.onetomany_uni.dto.Flipkart_User;
import org.jsp.onetomany_uni.dto.Items;

public class Flipkart_User_Items_Controller {

	public static void main(String[] args) {
		
		Items items1=new Items();
		items1.setId(1001);
		items1.setName("Laptop");
		items1.setPrice(150000);
		items1.setQty(1);
		
		Items items2 =new Items();
		items2.setId(1003);
		items2.setName("Airdopes");
		items2.setPrice(1250);
		items2.setQty(2);
		
		Items items3 =new Items();
		items3.setId(1003);
		items3.setName("Mobile");
		items3.setPrice(1300);
		items3.setQty(4);
		
		List<Items>list =new ArrayList<Items>();
		list.add(items1);
		list.add(items2);
		list.add(items3);
		
		Flipkart_User user =new Flipkart_User();
		user.setId(1);
		user.setEmail("san@email.com");
		user.setMno(97435322);
		user.setAddress("sewri");
		user.setPwd("790");
		
		user.setItems(list);
		
	Flipkart_User_Items_Dao dao= new Flipkart_User_Items_Dao();
//	dao.saveFlipkart(user);
	dao.updateFlipkart(2, list);
//	dao.deleteFlipkart(1);
//	dao.findFlipkartById(1);
//	dao.findALL(user);
	
	
		

		
		}

}
