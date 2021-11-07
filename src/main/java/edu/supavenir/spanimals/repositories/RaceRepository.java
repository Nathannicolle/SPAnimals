package edu.supavenir.spanimals.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.supavenir.spanimals.model.Race;

@Repository
public interface RaceRepository extends JpaRepository<Race, Integer> {

}