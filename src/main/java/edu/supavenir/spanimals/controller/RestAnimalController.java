package edu.supavenir.spanimals.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.supavenir.spanimals.model.Animal;
import edu.supavenir.spanimals.restController.AbstractRestController;

@RestController
@RequestMapping("/rest/animal")
public class RestAnimalController extends AbstractRestController<Animal> {

}
