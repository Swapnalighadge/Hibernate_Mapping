package org.jsp.onetoone_bi.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.onetoone_bi.dto.Passport;
import org.jsp.onetoone_bi.dto.Person;



public class Person_Passport_Dao {

	private EntityManagerFactory factory = null;
	private EntityManager manager = null;
	private EntityTransaction transaction = null;
	
	public EntityManager getEntityManager() {
		factory = Persistence.createEntityManagerFactory("dev");
		manager = factory.createEntityManager();
         return manager;		
	}
	
	
	public void savePerson(Person person) {
		manager = getEntityManager();
		transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(person);
		transaction.commit();
	}
	public void savePassport(Passport passport) {
		manager = getEntityManager();
		transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(passport);
		transaction.commit();
	}
	
	public void updatePerson(Person person) {
		manager = getEntityManager();
		transaction = manager.getTransaction();
		transaction.begin();
		manager.merge(person);
		transaction.commit();
	}
	public void updatePassport(Passport passport) {
		manager = getEntityManager();
		transaction = manager.getTransaction();
		transaction.begin();
		manager.merge(passport);
		transaction.commit();
	}
	
	public void findPersonById(int id) {
		manager = getEntityManager();		
	Person person =manager.find(Person.class, id);
		System.out.println(person);
		}
	public void findPassportById(int id) {
		manager = getEntityManager();		
	Passport passport =manager.find(Passport.class, id);
		System.out.println(passport);
		}
	
	public void deletePassportById(int id) {
		manager = getEntityManager();
		Passport passport =manager.find(Passport.class, id);
		transaction = manager.getTransaction();
		transaction.begin();
		manager.remove(passport);
		transaction.commit();
		}
	public void findALL(Person person) {
		manager = getEntityManager();
		Query query =manager.createQuery("select  a from Person a");
		List<Person>list=query.getResultList();
		System.out.println(list);
	}
	
	
	
	
	
	
}
