package com.abi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abi.dao.GreetingDao;
import com.abi.model.Greeting;


@Service
public class GreetingService {

	@Autowired
	GreetingDao greetingDao;


	public Greeting create(String content){
		Greeting output = null;

		output = new Greeting(content);

		output = greetingDao.save(output);

		return output;

	}

	public Greeting get(Long id){
		Greeting output = null;		

		output = greetingDao.findOne(id);

		return output;

	}

	public Greeting update(Greeting greeting){

		Greeting output = null;

		output = greetingDao.save(greeting);

		return output;

	}

}
