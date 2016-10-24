package com.abi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abi.dao.InviteeDao;
import com.abi.model.Invitee;


@Service
public class InviteeService {
	
	@Autowired
	InviteeDao inviteeDao;
	
	
	public Invitee create(String name){
		Invitee output = null;
		
		output = new Invitee(name);
		
		output = inviteeDao.save(output);
		
		return output;
		
	}
	
	public Invitee get(Long id){
		Invitee output = null;		
		
		output = inviteeDao.findOne(id);
		
		return output;
		
	}

}
