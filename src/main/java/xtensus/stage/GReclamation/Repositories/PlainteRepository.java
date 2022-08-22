package xtensus.stage.GReclamation.Repositories;

import java.util.Date;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import xtensus.stage.GReclamation.entities.Appeloffre;
import xtensus.stage.GReclamation.entities.DemandesType;
import xtensus.stage.GReclamation.entities.Document;
import xtensus.stage.GReclamation.entities.EtapesDemandes;
import xtensus.stage.GReclamation.entities.Plainte;

@Repository
public interface PlainteRepository  extends JpaRepository<Plainte, Integer>{
	
	
	
}
