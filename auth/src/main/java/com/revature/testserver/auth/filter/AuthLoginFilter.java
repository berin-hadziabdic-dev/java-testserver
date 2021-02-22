package com.revature.testserver.auth.filter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.testserver.auth.events.EventPublishers.ApplicationPublisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.stereotype.Component;

@Component
public class AuthLoginFilter extends UsernamePasswordAuthenticationFilter  {
    
    private ObjectMapper mapper;
    private ApplicationPublisher publisher;

    @Autowired
    public AuthLoginFilter(ObjectMapper injectedMapper, ApplicationPublisher injectedEventPublisher){
        super();
        this.mapper = injectedMapper;
        this.publisher = injectedEventPublisher;
    }

    @Override
    @Autowired
    public void setAuthenticationManager(AuthenticationManager manager) {
        super.setAuthenticationManager(manager);
    }

    

    
}
