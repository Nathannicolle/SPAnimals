package edu.supavenir.spanimals.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.supavenir.spanimals.model.Joursemaine;

@Repository
public interface JourRepository extends JpaRepository<Joursemaine, Integer> {

}
