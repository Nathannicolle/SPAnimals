package edu.supavenir.spanimals.restController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/models")
abstract public class AbstractRestController<T> {
	@Autowired
	private JpaRepository<T, Integer> repo;

	@GetMapping()
	public List<T> indexAction() {
		return repo.findAll();
	}

	@GetMapping("{id}")
	public Optional<T> getOneAction(@PathVariable int id) {
		return repo.findById(id);
	}

	@PostMapping()
	public T addAction(@RequestBody T model) {
		repo.saveAndFlush(model);
		return model;
	}

	@DeleteMapping("{id}")
	public T deleteAction(@PathVariable int id) {
		Optional<T> opt = repo.findById(id);
		if (opt.isPresent()) {
			T model = opt.get();
			repo.delete(model);
			return model;
		}
		return null;
	}

	@PutMapping("{id}")
	public T updateAction(@PathVariable int id, @RequestBody T model) {
		if (repo.existsById(id)) {
			repo.save(model);
			return model;
		}
		return null;
	}
}
