package edu.supavenir.spanimals.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.supavenir.model.Animal;

public interface AnimalRepository extends JpaRepository<Animal, Integer> {

}
