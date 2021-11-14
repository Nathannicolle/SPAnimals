package edu.supavenir.spanimals.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.supavenir.spanimals.model.Refuge;
import edu.supavenir.spanimals.restController.AbstractRestController;

@RestController
@RequestMapping("/rest/refuge")
public class RestRefugeController extends AbstractRestController<Refuge> {

}
