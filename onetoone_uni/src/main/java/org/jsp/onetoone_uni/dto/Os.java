package org.jsp.onetoone_uni.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Os {
	@Id
	private int id;
	private String type;
	private String bit;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBit() {
		return bit;
	}
	public void setBit(String bit) {
		this.bit = bit;
	}
	@Override
	public String toString() {
		return "Os [id=" + id + ", type=" + type + ", bit=" + bit + "]";
	}
	
 

}
