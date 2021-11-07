package edu.supavenir.spanimals.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import edu.supavenir.spanimals.model.Espece;

public interface EspeceRepository extends JpaRepository<Espece, Integer> {

}
