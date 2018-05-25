package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity//permet la prise en compte de la classe comme table de base de données
public class User {

	@Id//obligatoire pour la prise en compte de l'id de la bdd
	@GeneratedValue(strategy = GenerationType.IDENTITY)//permet l'auto incrémentation de l'id
    private Long id;

    private String firstName;

    private String lastName;
    
    public User() {
    super();
    }

    public User(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
    
}
