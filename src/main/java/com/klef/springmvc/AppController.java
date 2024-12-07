package com.klef.springmvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AppController {

	@Autowired
	DAO dao;	
	@GetMapping ("/show")
	public String show (Model m) {
	List<Student> sl= dao.getAllStudent();
	m.addAttribute("list", sl); 	
	return "show";
	}	
	@GetMapping ("/edit/(id)")
	public String edit (@PathVariable ("id") int id, Model m) {
	Student s= dao.getStuById(id); 
	m.addAttribute ("command", s);
	return "edit";
	}
	@PostMapping ("/editsave")
	public String editsave (@ModelAttribute("s") Student s) {
	int r= dao.update(s);
	return "redirect/show";
	}	
	@GetMapping ("/delete/(id)")
	public String delete (@PathVariable("id") int id) {
	int r = dao.delete(id); 
	return "redirect:/show";
	}	
	@GetMapping("/add")
	public String add (Model m) {
	m.addAttribute("command", new Student());
	return "add";
	}	
	@PostMapping ("/addsave")
	public String addsave (@ModelAttribute("s") Student s) {
	int r = dao.insert(s);
	return "redirect:/show";
}
}
