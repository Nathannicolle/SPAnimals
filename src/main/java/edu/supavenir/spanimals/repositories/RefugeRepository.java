package edu.supavenir.spanimals.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.supavenir.spanimals.model.Refuge;

@Repository
public interface RefugeRepository extends JpaRepository<Refuge, Integer> {

}
