package com.ty.manytomany_bi.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Student {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private int sid;
	private String sname;
	private String address;
	private long mno;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(joinColumns = @JoinColumn(name="sid"),inverseJoinColumns = @JoinColumn(name="cid"))
	private List<Course>course1;
	
	/**
	 * @return the mno
	 */
	public long getMno() {
		return mno;
	}

	/**
	 * @param mno the mno to set
	 */
	public void setMno(long mno) {
		this.mno = mno;
	}

	/**
	 * @return the course1
	 */
	public List<Course> getCourse1() {
		return course1;
	}

	/**
	 * @param course1 the course1 to set
	 */
	public void setCourse1(List<Course> course1) {
		this.course1 = course1;
	}

	@ManyToMany(cascade=CascadeType.ALL)
	private List<Course>course;

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
	 * @return the sname
	 */
	public String getSname() {
		return sname;
	}

	/**
	 * @param sname the sname to set
	 */
	public void setSname(String sname) {
		this.sname = sname;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the course
	 */
	public List<Course> getCourse() {
		return course1;
	}

	/**
	 * @param course the course to set
	 */
	public void setCourse(List<Course> course) {
		this.course1 = course;
	}
	
	
}
