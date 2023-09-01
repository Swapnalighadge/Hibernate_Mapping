package org.jsp.onetomany_bi.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Employee {
@Id
private int eid;
private String ename;
private double sal;
private String address;

@ManyToOne(cascade=CascadeType.ALL)
@JoinColumn
private Company company;

public int getEid() {
	return eid;
}

public void setEid(int eid) {
	this.eid = eid;
}

public String getEname() {
	return ename;
}

public double getSal() {
	return sal;
}

public void setSal(double sal) {
	this.sal = sal;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public void setEname(String ename) {
	this.ename = ename;
}



public Company getCompany() {
	return company;
}

public void setCompany(Company company) {
	this.company = company;
}

@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + ", sal=" + sal + ", address=" + address + ", company="
			+ company + "]";
}





}
