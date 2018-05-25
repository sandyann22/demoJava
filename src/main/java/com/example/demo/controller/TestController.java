package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.model.UserDAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@Autowired
	private UserDAO repository;

	// users
	@GetMapping("/users")

	public List<User> listeUtiisateurs() {
		return (List<User>) repository.findAll();
	}

	@GetMapping("/hello") // méthode pour recevoir une requête get
	// public Iterable<User> helloWorld() {
	// User user = new User(null, null);
	// user.setFirstName("sandrine");
	// user.setLastName("gras");
	public Iterable<User> maListe() {
		ArrayList<User> users = new ArrayList<>();// On crée une arraylist car pas encore de dbb

		users.add(new User("Michael", "Jackson"));
		users.add(new User("The", "Prince"));
		users.add(new User("Mike", "Jagger"));
		users.add(new User("Tracy", "Chapman"));
		users.add(new User("Coeur", "de Pirate"));

		return repository.saveAll(users);
	}

	// récupération du 1 er utlilisateur par l'id
	@GetMapping("/one")
	public User getFirstUser() {
		User user = repository.findById(1l).get();
		return user;
	}

	// création d'un nouvel utlilisateur
	@PostMapping("/newuser")
	public User createUser(User user) {
		return repository.save(user);
	}

	// mise à jour d'un nouvel utlilisateur
	@PutMapping("/user/{id}")
	public User updateUser() {
		User user = repository.findById(1l).get();
		user.setFirstName(user.getFirstName());
		user.setLastName(user.getLastName());
		User updateUser = repository.save(user);
		
		return updateUser;
	}
	@DeleteMapping("/delete")
	public ResponseEntity<?> deleteUser() {
		User user = repository.findById(1l).get();
	
	repository.delete(user);
		
		return  ResponseEntity.ok().build();
	}
		
	
	}
	

