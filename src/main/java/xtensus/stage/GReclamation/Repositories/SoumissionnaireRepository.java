package xtensus.stage.GReclamation.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import xtensus.stage.GReclamation.entities.Soumissionnaire;

@Repository
public interface SoumissionnaireRepository extends JpaRepository<Soumissionnaire, Integer>{

}
