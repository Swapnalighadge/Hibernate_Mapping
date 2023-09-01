package org.jsp.manytoone_uni.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
 @Id
 private int eid;
 private String ename;
 private double sal;
public int getId() {
	return eid;
}
public void setId(int id) {
	this.eid = id;
}
public String getName() {
	return ename;
}
public void setName(String name) {
	this.ename = name;
}
public double getSal() {
	return sal;
}
public void setSal(double sal) {
	this.sal = sal;
}
@Override
public String toString() {
	return "Employee [id=" + eid + ", name=" + ename + ", sal=" + sal + "]";
}
 
 
 
}
