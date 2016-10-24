package com.abi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abi.dao.GreetingDao;
import com.abi.model.Greeting;
import com.abi.model.Invitee;


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
	
	public List<Invitee> getInvitees(Greeting greeting){
		List<Invitee> output = null;
		
		output = greeting.getInvitees();
		
		return output;
		
	}
	
	public Greeting addInvitee(Greeting greeting,Invitee invitee){

		Greeting output = null;		
		
		greeting.getInvitees().add(invitee);
		invitee.getGreetings().add(greeting);

		output = greetingDao.save(greeting);

		return output;

	}

}
