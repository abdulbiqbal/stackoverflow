
package com.abi.test.service;

import static org.assertj.core.api.Assertions.assertThat;

import javax.transaction.Transactional;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
import org.testng.annotations.Test;

import com.abi.model.Greeting;
import com.abi.model.Invitee;
import com.abi.service.GreetingService;
import com.abi.service.InviteeService;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class GreetingServiceTests extends AbstractTransactionalTestNGSpringContextTests  {

	@Autowired
	GreetingService greetingService;
	
	@Autowired
	InviteeService inviteeService;

    @Test
    //@Transactional
    public void testGreetingService() {
    	assertThat(greetingService).isNotNull();
    	assertThat(inviteeService).isNotNull();
    	
    	Greeting greeting1 = greetingService.create("Test Greeting");
    	
    	assertThat(greeting1).isNotNull();
    	
    	Invitee invitee1 = inviteeService.create("Test Invitee");    	
    	
    	//greeting1.getInvitees().add(invitee1);
    	//greeting1 = greetingService.update(greeting1);
    	
    	Greeting greeting2 = greetingService.get(greeting1.getId());
    	
    	assertThat(greeting2).isNotNull();  
    	
    	//assertThat(greeting2.getInvitees().isEmpty()).isFalse();
    	
    	greetingService.addInvitee(greeting2, invitee1);
    	
    	assertThat(greetingService.getInvitees(greeting2).isEmpty()).isFalse();
    	
        
    }

    

}
