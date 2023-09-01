package org.jsp.onetomany_bi.controller;

import java.util.ArrayList;
import java.util.List;

import org.jsp.onetomany_bi.dao.Company_Employee_Dao;
import org.jsp.onetomany_bi.dto.Company;
import org.jsp.onetomany_bi.dto.Employee;

public class Company_Employee_Controller {

	public static void main(String[] args) {
		
		Company company=new Company();
		company.setCid(7);
		company.setCname("Capegemini");
		company.setLoc("Surat");
		company.setPhno(764543344);
		
		Employee emp1=new Employee();
		emp1.setEid(70);
		emp1.setEname("geeta");
		emp1.setSal(1000);
		emp1.setAddress("Marol");
		emp1.setCompany(company);
		
		
		Employee emp2=new Employee();
		emp2.setEid(71);
		emp2.setEname("Nikki");
		emp2.setSal(7000);
		emp2.setAddress("CSMT");
		emp2.setCompany(company);
		
	
		List<Employee>list=new ArrayList<Employee>();
		list.add(emp1);
		list.add(emp2);
		
		company.setEmployee(list);
		
		Company_Employee_Dao dao=new Company_Employee_Dao();
//		dao.saveCompany(company);
		
//		dao.saveEmoloyee(emp1);
//		dao.deleteCompany(2);
//		dao.updateCompany(1, list);
//		dao.findCompanyById(1);
//		dao.findALL(company);
		

	}

}
