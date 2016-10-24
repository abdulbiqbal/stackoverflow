package com.abi.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Invitee {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
	
	String name;
	String email;
	
	@ManyToMany(mappedBy = "invitees")
    private List<Greeting> greetings;
	
	public Invitee(){
		super();
	}
	
	public Invitee(String name){
		super();
		this.name = name;
	}

}
