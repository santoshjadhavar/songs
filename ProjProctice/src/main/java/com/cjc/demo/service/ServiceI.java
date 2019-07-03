package com.cjc.demo.service;

import java.util.List;


import com.cjc.demo.model.Registration;

public interface ServiceI {
	public void saveData(Registration r);
	public List<Registration> viewData();
	

}
