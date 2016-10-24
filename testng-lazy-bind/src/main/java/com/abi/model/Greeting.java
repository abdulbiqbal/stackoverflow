package com.abi.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Greeting {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
	
    private String content;
    
    @ManyToMany
    private List<Invitee> invitees = new ArrayList<Invitee>();
    
    public Greeting(){
    	super();
    }
    
    public Greeting(String content){
    	super();
    	this.content = content;
    }

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

	public List<Invitee> getInvitees() {
		return invitees;
	}

	public void setInvitees(List<Invitee> invitees) {
		this.invitees = invitees;
	}
}
