package edu.supavenir.spanimals.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import edu.supavenir.spanimals.model.Animal;
import edu.supavenir.spanimals.repositories.AnimalRepository;
import edu.supavenir.spanimals.repositories.RefugeRepository;

@RestController
public class TestRestController {
	@Autowired
	private AnimalRepository repoAnimal;
	private RefugeRepository refugeRepo;

	@GetMapping("/rest/animals")
	public List<Animal> indexAction() {
		return repoAnimal.findAll();
	}

	@GetMapping("/delete/{id}")
	public RedirectView delete(@PathVariable int id, RedirectAttributes attrs) {
		refugeRepo.deleteById(id);
		refugeRepo.flush();
		attrs.addFlashAttribute("msgDelete", ("Vous avez bien supprimé l'élément <b>" + id + "</b>"));
		return new RedirectView("/");
	}

}
