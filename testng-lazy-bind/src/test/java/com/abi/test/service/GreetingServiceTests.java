
package com.abi.test.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import com.abi.model.Greeting;
import com.abi.service.GreetingService;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class GreetingServiceTests extends AbstractTestNGSpringContextTests  {

	@Autowired
	GreetingService greetingService;

    @Test
    public void testService() {
    	assertThat(greetingService).isNotNull();
    	
    	Greeting test1 = greetingService.create("Test");
    	
    	assertThat(test1).isNotNull();
    	
    	Greeting test2 = greetingService.get(test1.getId());
    	
    	assertThat(test2).isNotNull();    	
    	
        
    }

    

}
