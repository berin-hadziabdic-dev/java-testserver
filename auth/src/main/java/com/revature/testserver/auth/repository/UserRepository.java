package com.revature.testserver.auth.repository;

import com.revature.testserver.auth.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,String>{
    
}
