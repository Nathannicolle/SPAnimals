package edu.supavenir.spanimals.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.supavenir.spanimals.model.Animal;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Integer> {

}
