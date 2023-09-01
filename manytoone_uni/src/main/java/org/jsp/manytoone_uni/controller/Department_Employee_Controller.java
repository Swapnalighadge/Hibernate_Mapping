package org.jsp.manytoone_uni.controller;

import org.jsp.manytoone_uni.dao.Department_Employee_Dao;
import org.jsp.manytoone_uni.dto.Department;
import org.jsp.manytoone_uni.dto.Employee;

public class Department_Employee_Controller {

	public static void main(String[] args) {
		
		Employee employee=new Employee();
		employee.setId(101);
		employee.setName("Swapnali");
		employee.setSal(87000);
		
		Department department =new Department();
		department.setId(1);
		department.setDname("Developer");
		department.setMno("764756855");
		department.setEmployee(employee);
		
		Department department1 =new Department();
		department1.setId(2);
		department1.setDname("Tester");
		department1.setMno("244556855");
		department1.setEmployee(employee);
		
		Department department2 =new Department();
		department2.setId(3);
		department2.setDname("sr.Developer");
		department2.setMno("90766855");
		department2.setEmployee(employee);
		
		Department_Employee_Dao dao=new Department_Employee_Dao();
		dao.saveDepartment(department2);
		dao.saveDepartment(department1);
		
		dao.updateDepartment(department2);
		dao.addDept(101, department2);
		dao.deleteDep(6);
		
		

	}

}
