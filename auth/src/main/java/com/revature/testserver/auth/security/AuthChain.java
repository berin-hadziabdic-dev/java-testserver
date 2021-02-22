package com.revature.testserver.auth.security;

import org.springframework.beans.factory.annotation.InjectionMetadata.InjectedElement;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;

@EnableWebSecurity(debug = true)
@Component
@Order(2)
public class AuthChain extends WebSecurityConfigurerAdapter{
    
    private UserDetailsService service;

    public AuthChain(UserDetailsService injectedService){
        this.service = injectedService;
    }
    @Override
    public void configure(WebSecurity web){
        web.
        ignoring().antMatchers("/h2**");
    }

    public void configure(HttpSecurity http) throws Exception {
        http.
            cors().disable().
            csrf().disable().
            authorizeRequests()
            .antMatchers("/auth/**")
            .authenticated();
    }

    public void configure(AuthenticationManagerBuilder builder) throws Exception {
        builder.userDetailsService(this.service);
    }

    @Override
    @Bean 
    public AuthenticationManager authenticationManager() throws Exception {
        return super.authenticationManager();
    }
}
