package com.ty.manytomany_bi.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Course {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private int cid;
	private String cname;
	private String duration;
	
	@ManyToMany(cascade=CascadeType.ALL,mappedBy="course")
	private List<Student>student;

	/**
	 * @return the cid
	 */
	public int getCid() {
		return cid;
	}

	/**
	 * @param cid the cid to set
	 */
	public void setCid(int cid) {
		this.cid = cid;
	}

	/**
	 * @return the cname
	 */
	public String getCname() {
		return cname;
	}

	/**
	 * @param cname the cname to set
	 */
	public void setCname(String cname) {
		this.cname = cname;
	}

	/**
	 * @return the duration
	 */
	public String getDuration() {
		return duration;
	}

	/**
	 * @param duration the duration to set
	 */
	public void setDuration(String duration) {
		this.duration = duration;
	}

	/**
	 * @return the student
	 */
	public List<Student> getStudent() {
		return student;
	}

	/**
	 * @param student the student to set
	 */
	public void setStudent(List<Student> student) {
		this.student = student;
	}
	
	
}
