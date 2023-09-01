package org.jsp.onetoone_bi.controller;

import org.jsp.onetoone_bi.dao.Person_Passport_Dao;
import org.jsp.onetoone_bi.dto.Passport;
import org.jsp.onetoone_bi.dto.Person;

public class Person_Passport_Controller {

	public static void main(String[] args) {
		Passport passport = new Passport();
		passport.setPno(2005);
		passport.setOrigin("india");
		passport.setDate_of_issue("30-08-2000");
		
		Person person = new Person();
		person.setId(214);
		person.setName("sachit");
		person.setPhno(9511199);
		person.setAddress("palghar");
		person.setPassport(passport);
		
		passport.setPerson(person);
		
		Person_Passport_Dao dao = new Person_Passport_Dao();
//	    dao.savePerson(person);
//	    dao.savePassport(passport);
	    
//	    dao.updatePerson(person);
		
//		dao.findPersonById(214);
//		dao.findPassportById(2005);
		
//		dao.deletePassportById(214);
		dao.findALL(person);
		

	}
	
	
}
