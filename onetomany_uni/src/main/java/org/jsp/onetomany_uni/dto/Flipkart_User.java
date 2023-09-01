package org.jsp.onetomany_uni.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Flipkart_User {
@Id
private int id;
private String email;
private String pwd;
private long mno;
private String address;

@OneToMany(cascade=CascadeType.ALL)
private List<Items>items;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPwd() {
	return pwd;
}

public void setPwd(String pwd) {
	this.pwd = pwd;
}

public long getMno() {
	return mno;
}

public void setMno(long mno) {
	this.mno = mno;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public List<Items> getItems() {
	return items;
}

public void setItems(List<Items> items) {
	this.items = items;
}

@Override
public String toString() {
	return "Flipkart_User [id=" + id + ", email=" + email + ", pwd=" + pwd + ", mno=" + mno + ", address=" + address
			+ ", items=" + items + "]";
}


}
