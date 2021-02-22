package com.revature.testserver.auth.events.Events;

import org.springframework.context.ApplicationEvent;

public class LoginEvent extends ApplicationEvent implements EventMessage<String> {


	public LoginEvent(Object source) {
		super(source);
		//TODO Auto-generated constructor stub
	}

    @Override
    public String getMessage() {
        // TODO Auto-generated method stub
        return "Login event succesful!";
    }
    
}
