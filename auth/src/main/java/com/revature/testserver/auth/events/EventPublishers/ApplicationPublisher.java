package com.revature.testserver.auth.events.EventPublishers;

import org.springframework.context.ApplicationEvent;

/**The ApplicationPublisher is the absolute event publishing interface for our application. */
public interface ApplicationPublisher {

    public void publishEvent(ApplicationEvent event) ;
    
}
