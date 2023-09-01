package org.jsp.manytoone_bi.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.manytoone_bi.dto.Student;
import org.jsp.manytoone_bi.dto.University;

public class Student_University_Dao {
 
	EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("dev");
	  EntityManager manager= entityManagerFactory.createEntityManager();
	  EntityTransaction transaction= manager.getTransaction();
	  
	  public void saveStudent(Student student) {
		  transaction.begin();
		  manager.persist(student);
		  transaction.commit();
	  }
	  
	  public void saveUniversity(University university) {
		  transaction.begin();
		  manager.persist(university);
		  transaction.commit();
	  }
	  
	  public void updateUniversity(University university) {
		  transaction.begin();
		  manager.merge(university);
		  transaction.commit();
	  }
	  public void updateStudent(Student student) {
		  transaction.begin();
		  manager.merge(student);
		  transaction.commit();
	  }
	  
	  public void addStudent(int id,Student student) {
		  University university =manager.find(University.class,id);
		  student.setUniversity(university);
		  
		  transaction.begin();
		  manager.merge(student);
		  transaction.commit();
	  }
	  
	  public void deleteStudent(int id) {
		  Student s2 =manager.find(Student.class,id);
		  s2.setUniversity(null);
		  
		  transaction.begin();
		  manager.remove(s2);
		  transaction.commit();
	  }
	  
	  public void findAllStudent(Student student) {
		  Query query =manager.createQuery("select a from Student a");
		  List<Student>list=query.getResultList();
		  System.out.println(list);
	  }
	  
	  public void findAllUniversity(University university) {
		  Query query =manager.createQuery("select a from University a");
		  List<University>list=query.getResultList();
		  System.out.println(list);
	  }
	  
	  
	  
}
