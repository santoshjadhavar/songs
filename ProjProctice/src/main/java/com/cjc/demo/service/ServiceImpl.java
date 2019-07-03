package com.cjc.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.cjc.demo.model.Registration;
import com.cjc.demo.reposatory.Reposatory;

@Service
public class ServiceImpl implements ServiceI {
@Autowired
Reposatory res;

@Override
public void saveData(Registration r) {
	// TODO Auto-generated method stub
	res.save(r);
	
}

@Override
public List<Registration> viewData() {
	// TODO Auto-generated method stub
	List<Registration> l=(List<Registration>) res.findAll();
	return l;
}


}
