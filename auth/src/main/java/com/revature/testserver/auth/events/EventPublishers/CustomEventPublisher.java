package com.revature.testserver.auth.events.EventPublishers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class CustomEventPublisher implements ApplicationPublisher {

    private ApplicationEventPublisher eventPublisher;

    @Autowired
    public CustomEventPublisher(ApplicationEventPublisher injectedEventPublisher) {
        this.eventPublisher = injectedEventPublisher;
    }

    @Override
    public void publishEvent(ApplicationEvent event) {
        // TODO Auto-generated method stub
        if(event != null)
            this.eventPublisher.publishEvent(event);
    }


    
}
