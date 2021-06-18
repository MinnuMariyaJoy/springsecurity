 package com.myprojects.springemail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SpringEmailApplication {
     @Autowired
	private EmailSenderService service;

	public static void main(String[] args) {
		SpringApplication.run(SpringEmailApplication.class, args);
	}

	@EventListener(ApplicationEvent.class)
	public void triggerMail(){
       service.sendSimpleEmail("demouser3101@gmail.com",
			   "This is email body",
			   "this is email subject");
	}

}
