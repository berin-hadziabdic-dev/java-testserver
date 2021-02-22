package com.revature.testserver.auth.security.Details;

import java.util.Optional;

import com.revature.testserver.auth.entity.User;
import com.revature.testserver.auth.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService  implements UserDetailsService {
    
    private UserRepository userRepo;
    
    @Autowired
    public CustomUserDetailsService(UserRepository injectedUserRepo){
        this.userRepo = injectedUserRepo;
    }

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // TODO Auto-generated method stub
        UserDetails returnDetails = null;

        Optional<User> detailsOptional = this.userRepo.findById(username);
        if(detailsOptional.isPresent())
        {
            returnDetails = new CustomUserDetails(detailsOptional.get());
        }
		return returnDetails;
	}
    
}
