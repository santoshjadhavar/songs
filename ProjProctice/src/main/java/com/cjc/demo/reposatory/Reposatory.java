package com.cjc.demo.reposatory;

import org.springframework.data.repository.CrudRepository;


import com.cjc.demo.model.Registration;

public interface Reposatory extends CrudRepository<Registration, Integer>{

}
