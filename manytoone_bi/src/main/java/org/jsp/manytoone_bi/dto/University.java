package org.jsp.manytoone_bi.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class University {
@Id
	private int uid;
    private String name;
    private String country;
    
    @OneToMany(cascade=CascadeType.ALL,mappedBy="Student")
    private List<Student>student;

	/**
	 * @return the uid
	 */
	public int getUid() {
		return uid;
	}

	/**
	 * @param uid the uid to set
	 */
	public void setUid(int uid) {
		this.uid = uid;
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
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
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

	@Override
	public String toString() {
		return "University [uid=" + uid + ", name=" + name + ", country=" + country + ", student=" + student + "]";
	}
    
    
}
