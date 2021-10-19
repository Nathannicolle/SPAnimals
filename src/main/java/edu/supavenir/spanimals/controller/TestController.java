package edu.supavenir.spanimals.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import edu.supavenir.spanimals.model.Refuge;
import edu.supavenir.spanimals.repositories.RefugeRepository;

@Controller
public class TestController {
	@Autowired

	private RefugeRepository refugeRepo;

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

//	@GetMapping("/infosRefuge")
//	public String returnPageRefuge() {
//		return "refuge";
//	}

	@GetMapping("/delete/{id}")
	public RedirectView delete(@PathVariable int id, RedirectAttributes attrs) {
		refugeRepo.deleteById(id);
		refugeRepo.flush();
		attrs.addFlashAttribute("msgDelete", ("Vous avez bien supprimé l'élément <b>" + id + "</b>"));
		return new RedirectView("/");
	}

	@GetMapping("/modifier/{id}")
	public String formModify(@PathVariable String id) {
		return "formRefuge";
	}

}