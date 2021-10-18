package edu.supavenir.spanimals.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.supavenir.spanimals.model.Animal;
import edu.supavenir.spanimals.repositories.AnimalRepository;

@Controller
public class TestController {
	@Autowired
	private AnimalRepository repoAnimal;

	@GetMapping("/")
	public String redirectToIndex() {
		return "index";
	}

	@GetMapping("/refuge")
	public String returnPageRefuge() {
		return "refuge";
	}

	@GetMapping("add/animal")
	public @ResponseBody String addAnimal() {
		Animal medor = new Animal();
		medor.setNom("Medor");
		medor.setCouleur("Noir");
		medor.setDescription("Gentil");
		if (repoAnimal.save(medor) != null) {
			return medor + " ajouté";
		}

		return "Problème d'ajout";
	}
}
