package edu.supavenir.spanimals.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.supavenir.spanimals.model.Espece;
import edu.supavenir.spanimals.model.Race;
import edu.supavenir.spanimals.repositories.AnimalRepository;
import edu.supavenir.spanimals.repositories.RaceRepository;
import edu.supavenir.spanimals.repositories.RefugeRepository;
import io.github.jeemv.springboot.vuejs.VueJS;
import io.github.jeemv.springboot.vuejs.utilities.Http;

@Controller
@RequestMapping("/animals")
public class AnimalControlleur {
	@Autowired
	private VueJS vue;

	@Autowired
	private RaceRepository raceRepo;
	@Autowired
	private AnimalRepository animalRepo;
	@Autowired
	private RefugeRepository especeRepo;

	@ModelAttribute(name = "vue")
	private VueJS getVue() {
		return this.vue;
	}

	@GetMapping("/listAnimal")
	public String getAnimalList() {
		vue.addData("animals", animalRepo.findAll());
		return "listAnimals";
	}

	@GetMapping("/formRace")
	public String redirectToFormRace() {
		vue.addData("race", raceRepo.findAll());
		vue.addData("Race", new Race());
		vue.addMethod("addRace", Http.post("'/rest/Race/'", "race", "console.log('race ajouté')"), "race");
		return "formRace";
	}

	@GetMapping("/formEspece")
	public String redirectToFormEspece() {
		vue.addData("race", especeRepo.findAll());
		vue.addData("espece", new Espece());
		vue.addMethod("addEspece", Http.post("'/rest/Espece/'", "espece", "console.log('espece ajouté')"), "espece");
		return "formEspece";
	}

	@GetMapping("/formAnimal")
	public String getAddAnimal() {

		return "formAnimal";
	}

}
