package org.jsp.manytoone_uni.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Department {
   @Id
   private int id;
   private String dname;
   private String mno;
   
   @ManyToOne(cascade=CascadeType.ALL)
   private Employee employee;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getDname() {
	return dname;
}

public void setDname(String dname) {
	this.dname = dname;
}

public String getMno() {
	return mno;
}

public void setMno(String mno) {
	this.mno = mno;
}

public Employee getEmployee() {
	return employee;
}

public void setEmployee(Employee employee) {
	this.employee = employee;
}

@Override
public String toString() {
	return "Department [id=" + id + ", dname=" + dname + ", mno=" + mno + ", employee=" + employee + "]";
}
   
   

}
