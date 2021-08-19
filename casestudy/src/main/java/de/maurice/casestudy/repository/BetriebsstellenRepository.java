package de.maurice.casestudy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import de.maurice.casestudy.model.Betriebsstellen;


public interface BetriebsstellenRepository extends JpaRepository<Betriebsstellen, String> {
	
}
