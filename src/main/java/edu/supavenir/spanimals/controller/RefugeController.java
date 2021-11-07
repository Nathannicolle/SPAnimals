package edu.supavenir.spanimals.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.supavenir.spanimals.model.Joursemaine;
import edu.supavenir.spanimals.model.Race;
import edu.supavenir.spanimals.model.Refuge;
import edu.supavenir.spanimals.repositories.HoraireRepository;
import edu.supavenir.spanimals.repositories.JourRepository;
import edu.supavenir.spanimals.repositories.RaceRepository;
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

	@Autowired
	private JourRepository jourRepo;

	@Autowired
	private HoraireRepository horaireRepo;

	@Autowired
	private RaceRepository raceRepo;

	
	@ModelAttribute(name = "vue")
	private VueJS getVue() {
		return this.vue;
	}

	@GetMapping("/refuge/{id}")
	public String indexAction(@PathVariable Integer id) {
		Refuge refuge = refugeRepo.getById(id);
		vue.addData("refuge", refugeRepo.getById(id));
		vue.addData("horaires", refuge.getHoraire());
		return "refuge";
	}

	@GetMapping("all")
	public String all() {
		vue.addData("refuges", refugeRepo.findAll());
		return "all";
	}

	@GetMapping("j")
	public @ResponseBody List<Joursemaine> allJ() {
		List<Joursemaine> refuges = jourRepo.findAll();
		return refuges;
	}

	@GetMapping("/refuge")
	public String redirectToForm() {
		vue.addData("refuge", new Refuge());
		vue.addMethod("addRefuge", Http.post("'/rest/refuge/'", "refuge", "console.log('refuge ajouté')"), "refuge");
		return "formRefuge";
	}
	
	@GetMapping("/Race")
	public String redirectToFormRace() {
		vue.addData("race", new Race());
		vue.addMethod("addRace", Http.post("'/Race/'", "race", "console.log('race ajouté')"), "race");
		return "formRace";
	}
	

	@GetMapping("/listRefuges")
	public String showAllRefuge() {
		vue.addData("refuges", refugeRepo.findAll());
		vue.addData("refuge", new Refuge());
		 vue.addData("jourSemaine", jourRepo.findAll());
		 vue.addMethod("addRefuge", Http.post("'/rest/refuge/'",
		 "console.log('ajouté')"), "refuge");
		 vue.addMethod("deleteRefuge", Http.delete("'/rest/refuge/'+refuge.id",
		 "console.log('supprimé')"), "refuge");

		return "listRefuges";
	}
}