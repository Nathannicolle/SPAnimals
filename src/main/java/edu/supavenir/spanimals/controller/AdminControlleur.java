package edu.supavenir.spanimals.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.supavenir.spanimals.repositories.AnimalRepository;
import edu.supavenir.spanimals.repositories.RefugeRepository;
import io.github.jeemv.springboot.vuejs.VueJS;
import io.github.jeemv.springboot.vuejs.utilities.Http;

@Controller
@RequestMapping("/admin")
public class AdminControlleur {
	@Autowired
	private VueJS vue;

	@Autowired
	private RefugeRepository refugeRepo;

	@Autowired
	private AnimalRepository animalRepo;

	@ModelAttribute(name = "vue")
	private VueJS getVue() {
		return this.vue;
	}

	@GetMapping("/refuges")
	public String all() {
		vue.addData("refuges", refugeRepo.findAll());
		return "listRefugeAdmin";
	}

	@GetMapping("/listAnimal")
	public String getAnimalList() {
		vue.addData("animals", animalRepo.findAll());
		vue.addMethod("deleteAnimal", Http.delete("'/rest/animal/'+animal.id", "console.log('supprimé')"), "animal");
		return "listAnimalAdmin";

	}

}
