package edu.supavenir.spanimals.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.supavenir.spanimals.model.Joursemaine;
import edu.supavenir.spanimals.model.Refuge;
<<<<<<< HEAD
import edu.supavenir.spanimals.repositories.JourRepository;
=======
>>>>>>> 6694b1d9827b615d34bca1c383306ac314aa49d1
import edu.supavenir.spanimals.repositories.RefugeRepository;

@Controller
public class TestController {
	@Autowired
	private RefugeRepository refugeRepo;

<<<<<<< HEAD
	@Autowired
	private JourRepository jourRepo;

=======
>>>>>>> 6694b1d9827b615d34bca1c383306ac314aa49d1
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
		refugeRepo.saveAndFlush(refuge);
		return "refuge ajouté :" + refuge;
	}

	@GetMapping("/jour")

	public String redirectToFormJour() {
		return "jour";
	}

	@PostMapping("/jourSemaine")
	public @ResponseBody String addJour(Joursemaine jour) {
		Joursemaine libelle = new Joursemaine();
		jourRepo.saveAndFlush(jour);
		return "jour ajouté :" + jour;
	}

//	@GetMapping("/infosRefuge")
//	public String returnPageRefuge() {
//		return "refuge";
//	}

	@GetMapping("/modifier/{id}")
	public String formModify(@PathVariable String id) {
		return "formRefuge";
	}

}