package com.sejin.jpa;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
public class User {

    @Id
    private String username;
    private String lastName;
    private String firstName;

    protected User() {
    }

    public User(String username, String lastName, String firstName) {
        this.username = username;
        this.lastName = lastName;
        this.firstName = firstName;
    }
}
