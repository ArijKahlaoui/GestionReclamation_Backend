package xtensus.stage.GReclamation.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import xtensus.stage.GReclamation.entities.Appeloffre;

@Repository
public interface AppeloffreRepository extends JpaRepository<Appeloffre, Integer>{
	
}
