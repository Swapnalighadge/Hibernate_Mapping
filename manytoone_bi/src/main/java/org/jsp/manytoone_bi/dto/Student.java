package org.jsp.manytoone_bi.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Student {
@Id
	private int sid;
    private String name;
    private String sec;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private University university;

	/**
	 * @return the sid
	 */
	public int getSid() {
		return sid;
	}

	/**
	 * @param sid the sid to set
	 */
	public void setSid(int sid) {
		this.sid = sid;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the sec
	 */
	public String getSec() {
		return sec;
	}

	/**
	 * @param sec the sec to set
	 */
	public void setSec(String sec) {
		this.sec = sec;
	}

	/**
	 * @return the university
	 */
	public University getUniversity() {
		return university;
	}

	/**
	 * @param university the university to set
	 */
	public void setUniversity(University university) {
		this.university = university;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", sec=" + sec + ", university=" + university + "]";
	}
    
    
    
    
}
