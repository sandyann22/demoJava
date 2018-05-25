package com.example.demo.controller;

//import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.User;
import com.example.demo.model.UserDAO;

@Controller
public class VueController {

	@Autowired
	private UserDAO repository;
	
	@GetMapping("/") // retourne la vue
	public String homeForm(Model model) {// la méthode Form() utilise un objet Model pour renvoyer un nouvel user
		model.addAttribute("userform", new User());
		return "pages/home.html";
	}
	
	// création d'un nouvel utlilisateur
	@PostMapping("/adduser")//adduser c'est la route
	public String createUser(@ModelAttribute User user) {
		repository.save(user);
		return "pages/Result.html";//return c'est vers la page
	}

}
