package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@repository
public class UserDaoImpl implements UserDAO{
	
	public static List<User> users = new ArrayList<>();//On crée une arraylist car pas encore de dbb
	static {
		users.add(new User("Michael", "Jackson"));
		users.add(new User("The", "Prince"));
		users.add(new User("Mike", "Jagger"));
		users.add(new User("Tracy", "Chapman"));
		users.add(new User("Coeur", "de Pirate"));
	}
	

	@Override//définit une méthode qui est héritée de la classe parente
	public List<User> findall() {
		// TODO Auto-generated method stub
		return users;
	}

	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User save(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(User arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends User> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Long arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean existsById(Long arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<User> findAllById(Iterable<Long> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<User> findById(Long arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends User> Iterable<S> saveAll(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
