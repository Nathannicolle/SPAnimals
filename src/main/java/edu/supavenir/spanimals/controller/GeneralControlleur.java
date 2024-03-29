package edu.supavenir.spanimals.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.supavenir.spanimals.model.Joursemaine;
import edu.supavenir.spanimals.repositories.AnimalRepository;
import edu.supavenir.spanimals.repositories.EspeceRepository;
import edu.supavenir.spanimals.repositories.JourRepository;
import edu.supavenir.spanimals.repositories.RefugeRepository;
import io.github.jeemv.springboot.vuejs.VueJS;
import io.github.jeemv.springboot.vuejs.utilities.Http;

@Controller
public class GeneralControlleur {
	@Autowired
	private VueJS vue;
	
	@Autowired
	private AnimalRepository animalRepo;

	@Autowired
	private RefugeRepository refugeRepo;

	@Autowired
	private JourRepository jourRepo;

	@Autowired
	private EspeceRepository especeRepo;

	@ModelAttribute(name = "vue")
	private VueJS getVue() {
		return this.vue;
	}
	
	@GetMapping("/")
	public String redirectToIndex() {
		vue.addMethod("addRefuge", Http.post("'/rest/refuge/'", "refuge", "console.log('refuge ajouté')"), "refuge");
		vue.addData("animals", animalRepo.findAll());
		return "index";
	}

//	@GetMapping("/refuge")
//
//	public String redirectToForm() {
//		return "formRefuge";
//	}
//
//	@PostMapping("/refugeAdd")
//	public @ResponseBody String addAction(Refuge refuge) {
//		Refuge refuge2 = new Refuge();
//		refugeRepo.saveAndFlush(refuge);
//		return "refuge ajouté :" + refuge;
//	}

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

	/*
	 * @PostMapping("/formEspece") public @ResponseBody String addEspece(Espece
	 * espece) { Espece libelle = new Espece(); especeRepo.saveAndFlush(espece);
	 * return "espece ajouté :" + espece; }
	 * 
	 */
	@GetMapping("/modifier/{id}")
	public String formModify(@PathVariable String id) {
		return "formRefuge";
	}
	
	@GetMapping("/mentions")
	public String getMentionsLegales() {
		return "mentionsLegales";
	}

}