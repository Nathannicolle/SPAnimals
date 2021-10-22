package edu.supavenir.spanimals.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.supavenir.spanimals.model.Refuge;
import edu.supavenir.spanimals.repositories.RefugeRepository;
import io.github.jeemv.springboot.vuejs.VueJS;
import io.github.jeemv.springboot.vuejs.utilities.Http;

@Controller
@RequestMapping("/infosRefuge")
public class RefugeController {
	@Autowired
	private VueJS vue;

	@Autowired
	private RefugeRepository refugeRepo;

	@ModelAttribute(name = "vue")
	private VueJS getVue() {
		return this.vue;
	}

	@GetMapping("/refuge/{id}")
	public String indexAction(@PathVariable Integer id) {
		vue.addData("refuge", refugeRepo.getById(id));
		return "refuge";
	}

	@GetMapping("/refuge")
	public String redirectToForm() {
		vue.addData("refuge", new Refuge());
		vue.addMethod("addRefuge", Http.post("'/rest/refuge/'", "refuge", "console.log('ajouté')"), "refuge");
		return "formRefuge";
	}

	@GetMapping("/listRefuges")
	public String showAllRefuge() {
		vue.addData("refuges", refugeRepo.findAll());
		vue.addMethod("deleteRefuge", Http.delete("'/rest/refuge/'+refuge.id", "console.log('supprimé')"), "refuge");
		return "listRefuges";
	}
}
