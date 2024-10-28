package com.ty.Spting.controller.service;

import com.ty.Spring.controller.dao.PersonDao;
import com.ty.Spring.controller.entity.Person;

public class PersonService {
	
	public void save(Person person) {
		
		PersonDao dao=new PersonDao();
		dao.save(person);
		
	}

}
