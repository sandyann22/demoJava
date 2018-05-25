package com.example.demo.model;

import java.util.List;

//import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface UserDAO extends CrudRepository<User,Long> {
	
	//public List<User> findall();//lister les utilisateurs
	//public User findById(int id);//trouver un utilisateur par son id
	//@SuppressWarnings("unchecked")//permet de signaler au compilateur que l’on sait de réaliser une opération risquée, 
	//public User save(User user);// mettre à jour les utilisateurs
	
}
