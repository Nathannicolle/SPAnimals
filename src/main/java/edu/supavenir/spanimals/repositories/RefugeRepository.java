package edu.supavenir.spanimals.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import edu.supavenir.spanimals.model.Refuge;


import org.springframework.stereotype.Repository;

@Repository
public interface RefugeRepository extends JpaRepository<Refuge, Integer> {

}
