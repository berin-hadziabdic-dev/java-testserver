package com.revature.testserver.auth.events.Listeners;

import java.util.EventListener;

import com.revature.testserver.auth.events.EventPublishers.ApplicationPublisher;
import com.revature.testserver.auth.events.EventPublishers.CustomEventPublisher;
import com.revature.testserver.auth.events.Events.LoginEvent;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class LoginListener implements ApplicationListener<LoginEvent> {

    @Override
    public void onApplicationEvent(LoginEvent event) {
        // TODO Auto-generated method stub
        System.out.println("Login succesful!");
    }
    
}
