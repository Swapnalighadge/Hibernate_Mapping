package com.ty.manytomany_bi.controller;

import java.util.ArrayList;
import java.util.List;

import com.ty.manytomany_bi.dao.Course_Student_Dao;
import com.ty.manytomany_bi.dto.Course;
import com.ty.manytomany_bi.dto.Student;

public class Course_Student_Controller {

	public static void main(String[] args) {
		Student student =new Student();
		student.setSname("Akshata");
		student.setAddress("Dadar");
		student.setMno(9326362327l);
		
		Student student1 =new Student();
		student1.setSname("Payal");
		student1.setAddress("Goregaon");
		student1.setMno(9326663567l);
		
		Student student2 =new Student();
		student2.setSname("Rinku");
		student2.setAddress("Vasai");
		student2.setMno(9137564312l);
       
		
		
		Course course=new Course();
		course.setCname("Java");
		course.setDuration("1month");
		
		Course course1=new Course();
		course1.setCname("Framework");
		course1.setDuration("2month");
		
		Course course2=new Course();
		course2.setCname("SQL");
		course2.setDuration("2month");
		
		List<Student>list=new ArrayList<Student>();
		list.add(student);
		list.add(student1);
		list.add(student2);
		
		List<Course>clist=new ArrayList<Course>();
		clist.add(course);
		clist.add(course1);
		clist.add(course2);
		
		student.setCourse(clist);
		course.setStudent(list);
		
		Course_Student_Dao dao=new Course_Student_Dao();
		dao.saveCourse(course);
		dao.saveCourse(course1);
		dao.saveCourse(course2);
		
//		dao.saveStudent(student);
//		dao.saveStudent(student1);
//		dao.saveStudent(student2); 
//		dao.updateStudent(student1);
//		dao.updateCourse(course2);
//		dao.deleteCourse(1);
//      dao.findAllCourse(course);
	}

}
