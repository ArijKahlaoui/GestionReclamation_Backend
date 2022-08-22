package xtensus.stage.GReclamation.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import xtensus.stage.GReclamation.entities.EtatSuivi;

@Repository
public interface EtatSuiviRepository extends JpaRepository<EtatSuivi,Long>{

}
