package com.revature.testserver.auth.beans;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class Beans {

    @Bean
    public PasswordEncoder getEncoder(){
        return  NoOpPasswordEncoder.getInstance();
    }

    @Bean 
    public ObjectMapper getObjectMapper() {
        return new ObjectMapper();
    }
    
}
