package com.abi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.abi.model.Greeting;
import com.abi.service.GreetingService;

@RestController
@RequestMapping("/greetings")
public class GreetingController {  
	
	@Autowired
	GreetingService greetingService;

    @Transactional
	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
    public Greeting greeting(@RequestBody Greeting  request) {
    	
    	Greeting output = null;
    	
    	output = greetingService.create(request.getContent());
    	
    	return output;
        
    }
    
    
    @Transactional
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
	@ResponseBody
    public Greeting get(@PathVariable Long id) {
    	
    	Greeting output = null;
    	
    	output = greetingService.get(id);
    	
    	return output;
        
    }
}
