package edu.supavenir.spanimals.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/models")
public class AbstractRestController<T> {
	@Autowired
	private JpaRepository<T, Integer> repo;

	@GetMapping()
	public List<T> indexAction() {
		return repo.findAll();
	}
}
