package com.cjc.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;


import com.cjc.demo.model.Registration;
import com.cjc.demo.service.ServiceI;
@CrossOrigin("*")
@RestController
@RequestMapping("Registration")
public class HomeController {
	
	@Autowired
	ServiceI ser;

	@RequestMapping(value="savedata",method=RequestMethod.POST,produces="application/json",consumes="application/json")
	public void m1(@RequestBody Registration r) {
		System.out.println("hii");
		ser.saveData(r);
		
		
	}
	
	@RequestMapping(value="getalldata",method=RequestMethod.GET,produces="application/json",consumes="application/json")
	public List<Registration> m2() {
		 List<Registration> l=ser.viewData();
		return l;
		 
		
	}
	
	

}
