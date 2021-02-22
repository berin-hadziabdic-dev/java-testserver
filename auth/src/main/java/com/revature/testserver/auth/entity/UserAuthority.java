package com.revature.testserver.auth.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="authority") 
public class UserAuthority {
    @Id
    @Column(nullable = false, insertable = true, updatable = false)
     Integer authority_id;
     @Column(nullable=false)
     String description;
     
}
