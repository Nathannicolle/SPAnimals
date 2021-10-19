package edu.supavenir.spanimals.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.supavenir.spanimals.repositories.RefugeRepository;
import io.github.jeemv.springboot.vuejs.VueJS;

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

	@GetMapping("/listRefuges")
	public String showAllRefuge() {
		vue.addData("refuges", refugeRepo.findAll());
		return "listRefuges";
	}
}
