package com.ty.manytomany_bi.dao;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.manytomany_bi.dto.Course;
import com.ty.manytomany_bi.dto.Student;



public class Course_Student_Dao {
	private EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
	private EntityManager manager=emf.createEntityManager();
	private EntityTransaction transaction=manager.getTransaction();
	
	public void saveCourse(Course course) {
		transaction.begin();
		manager.persist(course);
		transaction.commit();
	}
	
	public void saveStudent(List<Student> student) {
		for (Student student2 : student) {
			transaction.begin();
			manager.persist(student);
		}
		
		transaction.commit();
	}
	
	public void updateStudent (Student student ) {
		  transaction.begin();
		  manager.merge(student);
		  transaction.commit();
	  }
	  public void updateCourse(Course course) {
		  transaction.begin();
		  manager.merge(course);
		  transaction.commit();
	  }
	  
	  public void deleteCourse(int id) {
		  Course course=manager.find(Course.class,id);
		  if(course!=null) {
			  List<Student> students=manager.createQuery("from Student").getResultList();
			  for(Student student:students) {
				  if(student.getCourse().contains(course)) {
					 student.getCourse().remove(course);
				  }
			  }
			  transaction.begin();
			  manager.remove(course);
			  transaction.commit();
		  }
	  }
	  
	  public void findAllCourse(Course course) {
		  Query query =manager.createQuery("select a from Course a");
		  List<Course>list=query.getResultList();
		  System.out.println(list);
	  }
	  

}
