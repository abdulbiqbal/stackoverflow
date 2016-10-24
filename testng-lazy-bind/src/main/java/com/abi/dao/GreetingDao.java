package com.abi.dao;

import org.springframework.data.repository.CrudRepository;

import com.abi.model.Greeting;

public interface GreetingDao extends CrudRepository<Greeting, Long>    {

}
