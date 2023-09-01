package org.jsp.manytoone_bi.controller;

import java.util.ArrayList;
import java.util.List;

import org.jsp.manytoone_bi.dao.Student_University_Dao;
import org.jsp.manytoone_bi.dto.Student;
import org.jsp.manytoone_bi.dto.University;

public class Student_University_Controller {
	
	public static void main(String[] args) {
		University university=new University();
		university.setUid(101);
		university.setName("Mumbai Unviersity");
		university.setCountry("India");
		
		Student student=new Student();
		student.setSid(1);
		student.setName("Swapnali");
		student.setSec("Science");
		student.setUniversity(university);
		
		Student student1=new Student();
		student1.setSid(2);
		student1.setName("Anuja");
		student1.setSec("Commerce");
		student1.setUniversity(university);
		
		Student student2=new Student();
		student2.setSid(3);
		student2.setName("Manisha");
		student2.setSec("Arts");
		student2.setUniversity(university);
		
		
		Student student3=new Student();
		student3.setSid(4);
		student3.setName("Janavi");
		student3.setSec("Commerce");
		student3.setUniversity(university);
		
		Student student4=new Student();
		student4.setSid(5);
		student4.setName("Prajakta");
		student4.setSec("Commerce");
		student4.setUniversity(university);
		
		List<Student>list=new ArrayList<Student>();
		list.add(student);
		list.add(student1);
		list.add(student2);
		list.add(student3);
		list.add(student4);
		
		university.setStudent(list);
		
		Student_University_Dao dao =new Student_University_Dao();
		dao.saveStudent(student);
		dao.saveUniversity(university);
		dao.updateStudent(student3);
		dao.updateUniversity(university);
		dao.addStudent(102, student4);
		dao.deleteStudent(2);
		dao.findAllStudent(student4);
		dao.findAllUniversity(university);
	}

}
