package com.revature.testserver.auth.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="user")
public class User {
    @Id
    @Column(nullable= false, insertable = true, updatable = false)
    String username;
    @Column(name="pass", nullable = false, insertable = true, updatable = true)
    String password;
}
