package org.jsp.onetoone_uni.controller;

import org.jsp.onetoone_uni.dao.Mobile_Os_Dao;
import org.jsp.onetoone_uni.dto.Mobile;
import org.jsp.onetoone_uni.dto.Os;

public class Mobile_Os_Controller {

	public static void main(String[] args) {
		Mobile mobile=new Mobile();
		mobile.setId(102);
		mobile.setName("Vivo");
		mobile.setColor("blue");
		mobile.setPrice(10000);
		
		Os os=new Os();
		os.setId(1004);
		os.setBit("64bit");
		os.setType("android");
		
		mobile.setOs(os);
		
		Mobile_Os_Dao dao = new Mobile_Os_Dao();
		dao.saveMobile(mobile);
		dao.saveOs(os);
		
//		dao.updateMobile(mobile);
//		dao.updateOs(os);
		
//		dao.findMobileById(101);
//		dao.findOById(1003);
		
//		dao.deleteMobileById(101);
//		dao.deleteOsById(1003);
		
	}

}
