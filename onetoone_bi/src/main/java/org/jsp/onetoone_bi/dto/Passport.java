package org.jsp.onetoone_bi.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Passport {
@Id
	private int pno;
	private String origin;
	private String date_of_issue;
	
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "passport")
	private Person person ;
	
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDate_of_issue() {
		return date_of_issue;
	}
	public void setDate_of_issue(String date_of_issue) {
		this.date_of_issue = date_of_issue;
	}
	@Override
	public String toString() {
		return "Passport [pno=" + pno + ", origin=" + origin + ", date_of_issue=" + date_of_issue + ", person=" + person
				+ "]";
	}
	
	
	
}
