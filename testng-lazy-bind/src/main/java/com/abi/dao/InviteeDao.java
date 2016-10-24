package com.abi.dao;

import org.springframework.data.repository.CrudRepository;

import com.abi.model.Invitee;

public interface InviteeDao extends CrudRepository<Invitee, Long>  {

}
