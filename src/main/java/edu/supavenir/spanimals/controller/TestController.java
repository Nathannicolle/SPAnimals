package edu.supavenir.spanimals.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.supavenir.spanimals.model.Refuge;
import edu.supavenir.spanimals.repositories.AnimalRepository;
import edu.supavenir.spanimals.repositories.RefugeRepository;

@Controller
public class TestController {
	@Autowired

	private RefugeRepository repo1;

	private AnimalRepository repoAnimal;

	@GetMapping("/")
	public String redirectToIndex() {
		return "index";
	}

	@GetMapping("/refuge")

	public String redirectToForm() {
		return "formRefuge";
	}

	@PostMapping("/refugeAdd")
	public @ResponseBody String addAction(Refuge refuge) {
		Refuge refuge2 = new Refuge();

		repo1.saveAndFlush(refuge);

		return "refuge ajouté :" + refuge;
	}

	public String returnPageRefuge() {
		return "refuge";
	}

}