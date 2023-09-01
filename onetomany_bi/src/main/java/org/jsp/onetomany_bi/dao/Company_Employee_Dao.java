package org.jsp.onetomany_bi.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.transaction.Transaction;

import org.jsp.onetomany_bi.dto.Company;
import org.jsp.onetomany_bi.dto.Employee;



public class Company_Employee_Dao {
  EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("dev");
  EntityManager manager= entityManagerFactory.createEntityManager();
  EntityTransaction transaction= manager.getTransaction();
  
  public  void saveCompany(Company company){
	  transaction.begin();
	  List<Employee>employees=company.getEmployee();
	  for (Employee employee : employees) {
		employee.setCompany(company);
	}
		manager.persist(company);
		transaction.commit();
  }
  
  public  void saveEmoloyee(Employee employee){
	  transaction.begin();
		manager.persist(employee);
		transaction.commit();
  }
  
  public void deleteCompany(int id) {
		
		Company company = manager.find(Company.class, id);
		transaction.begin();
		manager.remove(company);
		transaction.commit();
		
	}

	public void updateCompany(int id,List<Employee>employee) {
		Company com=manager.find(Company.class,id);
		if(com!=null) {
			List<Employee>list=com.getEmployee();
			list.addAll(employee);
			com.setEmployee(list);
			
			transaction.begin();
			manager.merge(com);
			transaction.commit();
			}}
	
	public void findCompanyById(int id) {
		
		Company company =manager.find(Company.class, id);
		System.out.println(company);
		}

	public void findALL(Company company) {
		Query query =manager.createQuery("select  a from Company a");
		List<Company>list=query.getResultList();
		System.out.println(list);
	}
}
