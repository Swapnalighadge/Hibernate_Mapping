package org.jsp.onetoone_uni.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.onetoone_uni.dto.Mobile;
import org.jsp.onetoone_uni.dto.Os;

public class Mobile_Os_Dao {
	
	public void saveMobile(Mobile mobile) {
		EntityManagerFactory factory =Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		transaction.begin();
		manager.persist(mobile);
		transaction.commit();
		
	}
	
	public void saveOs(Os os) {
		EntityManagerFactory factory =Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		transaction.begin();
		manager.persist(os);
		transaction.commit();
		
	}
	
	public void updateMobile(Mobile mobile) {
		EntityManagerFactory factory =Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		transaction.begin();
		manager.merge(mobile);
		transaction.commit();
	}
	
	public void updateOs(Os os) {
		EntityManagerFactory factory =Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		transaction.begin();
		manager.merge(os);
		transaction.commit();
		}
	
	public void findMobileById(int id) {
		EntityManagerFactory factory =Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		
		Mobile mobile =manager.find(Mobile.class, id);
		System.out.println(mobile);
		}
	
	public void findOById(int id) {
		EntityManagerFactory factory =Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		
		Os os =manager.find(Os.class, id);
		System.out.println(os);
		
			}
	public void deleteMobileById(int id) {
		EntityManagerFactory factory =Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		Mobile mobile =manager.find(Mobile.class, id);
		if(mobile!=null) {
		transaction.begin();
		manager.remove(mobile);
		transaction.commit();
	}else {
		System.out.println("Object not deleted");
	}}
		
		public void deleteOsById(int id) {
			EntityManagerFactory factory =Persistence.createEntityManagerFactory("dev");
			EntityManager manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			
			Os os =manager.find(Os.class, id);
			if(os!=null) {
			transaction.begin();
			manager.remove(os);
			transaction.commit();
		}else {
			System.out.println("Object not deleted");
		}
	
	}
}
