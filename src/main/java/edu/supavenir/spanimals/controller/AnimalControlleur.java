package edu.supavenir.spanimals.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.supavenir.spanimals.repositories.AnimalRepository;
import io.github.jeemv.springboot.vuejs.VueJS;

@Controller
@RequestMapping("/animals")
public class AnimalControlleur {
	@Autowired
	private VueJS vue;
	
	@Autowired
	private AnimalRepository animalRepo;
	
	@ModelAttribute(name = "vue")
	private VueJS getVue() {
		return this.vue;
	}
	
	@GetMapping("/listAnimal")
	public String getAnimalList() {
		vue.addData("animals", animalRepo.findAll());
		return "listAnimals";
	}
}
