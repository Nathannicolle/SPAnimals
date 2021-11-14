package edu.supavenir.spanimals.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import edu.supavenir.animals.technics.CSSMessage;
import edu.supavenir.spanimals.model.Animal;
import edu.supavenir.spanimals.model.Refuge;
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
	
	@GetMapping("/refuge/{id}")
	public String indexAction(@PathVariable Integer id) {
		Refuge refuge = refugeRepo.getById(id);
		vue.addData("refuge", refugeRepo.getById(id));
		vue.addData("horaires", refuge.getHoraire());
		return "refugeAdmin";
	}

	@GetMapping("/listAnimal")
	public String getAnimalList() {
		vue.addData("animals", animalRepo.findAll());
		vue.addMethod("deleteAnimal", Http.delete("'/rest/animal/'+animal.id", "console.log('supprimé')"), "animal");
		return "listAnimalAdmin";
	}
	
	@GetMapping("RefugeDeleteConfirmation/{nom}/{id}")
	public RedirectView deleteConfirmation(@PathVariable String nom, @PathVariable String id, RedirectAttributes attrs) {
		attrs.addFlashAttribute("msgDelete", CSSMessage.ErrorMessage("Voulez-vous supprimer l'élément <b>" + nom + "</b> ? <br><a href='/admin/listRefugeAdmin' class=\"ui inverted secondary button\">Annuler</a> <v-btn @click=\"deleteRefuge(oneRefuge)\" color=\"error\">Confirmer</v-btn>"));
		return new RedirectView("listRefugeAdmin");
	}
	
	@GetMapping("/animal/{id}")
	public String getAnimal(@PathVariable Integer id) {
		Animal animal = animalRepo.getById(id);
		vue.addData("animal", animalRepo.getById(id));
		vue.addData("race", animal.getRace());
		vue.addData("refuge", animal.getRefuge());
		return "animalAdmin";
	}
}
