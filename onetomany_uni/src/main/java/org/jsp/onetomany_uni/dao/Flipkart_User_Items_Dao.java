package org.jsp.onetomany_uni.dao;

import java.security.PublicKey;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.onetomany_uni.dto.Flipkart_User;
import org.jsp.onetomany_uni.dto.Items;



public class Flipkart_User_Items_Dao {
	private EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
	private EntityManager manager =factory.createEntityManager();
	private EntityTransaction transaction =manager.getTransaction();
	

public void saveFlipkart(Flipkart_User kart) {
	transaction.begin();
	manager.persist(kart);
	transaction.commit();
}

public void deleteFlipkart(int id) {
	
	Flipkart_User flipkart = manager.find(Flipkart_User.class, id);
	transaction.begin();
	manager.remove(flipkart);
	transaction.commit();
	
}

public void updateFlipkart(int id,List<Items>items) {
	Flipkart_User user=manager.find(Flipkart_User.class,id);
	if(user!=null) {
		List<Items>list=user.getItems();
		list.addAll(items);
		user.setItems(list);
		
		transaction.begin();
		manager.merge(user);
		transaction.commit();
		}}

public void findFlipkartById(int id) {
	
	Flipkart_User flipkart =manager.find(Flipkart_User.class, id);
	System.out.println(flipkart);
	}

public void findALL(Flipkart_User flipkart) {
	Query query =manager.createQuery("select  a from Flipkart a");
	List<Flipkart_User>list=query.getResultList();
	System.out.println(list);
}


}
