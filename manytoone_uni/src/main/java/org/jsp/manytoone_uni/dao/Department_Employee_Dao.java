package org.jsp.manytoone_uni.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.manytoone_uni.dto.Department;
import org.jsp.manytoone_uni.dto.Employee;

public class Department_Employee_Dao {
	 EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("dev");
	  EntityManager manager= entityManagerFactory.createEntityManager();
	  EntityTransaction transaction= manager.getTransaction();
	  
	  public void saveDepartment(Department department) {
		  transaction.begin();
		  manager.persist(department);
		  transaction.commit();
	  }
	  
	  public void updateDepartment(Department department) {
		  transaction.begin();
		  manager.merge(department);
		  transaction.commit();
	  }
	  
	  public void addDept(int id,Department department) {
		  Employee employee=manager.find(Employee.class,id);
		  department.setEmployee(employee);
		  
		  transaction.begin();
		  manager.merge(department);
		  transaction.commit();
	  }
	  
	  public void deleteDep(int id) {
		  Department department =manager.find(Department.class, id);
		  department.setEmployee(null);
		  
		  transaction.begin();
		  manager.remove(department);
		  transaction.commit();
	  }
}
