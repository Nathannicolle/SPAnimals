package edu.supavenir.spanimals.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.supavenir.spanimals.model.Animal;
import edu.supavenir.spanimals.model.Horaire;

public interface HoraireRepository extends JpaRepository<Horaire, Integer> {

}
