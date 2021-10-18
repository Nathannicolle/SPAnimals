package edu.supavenir.spanimals.controller;

import org.springframework.beans.factory.annotation.Autowired;

import edu.supavenir.spanimals.repositories.RefugeRepository;

public class RefugeController {
	@Autowired
	private RefugeRepository refugeRepo;
}
