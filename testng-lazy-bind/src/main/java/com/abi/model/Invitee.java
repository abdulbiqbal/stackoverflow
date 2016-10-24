package com.abi.model;

import java.util.ArrayList;
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
    private List<Greeting> greetings = new ArrayList<Greeting>();
	
	public Invitee(){
		super();
	}
	
	public Invitee(String name){
		super();
		this.name = name;
	}

	public List<Greeting> getGreetings() {
		return greetings;
	}

	public void setGreetings(List<Greeting> greetings) {
		this.greetings = greetings;
	}

}
