package xtensus.stage.GReclamation.Repositories;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import xtensus.stage.GReclamation.entities.ActeurType;
import xtensus.stage.GReclamation.entities.DemandesType;
import xtensus.stage.GReclamation.entities.EtapesDemandes;


@Repository
public interface EtapesdemandesRepository extends JpaRepository<EtapesDemandes,Integer>{

	Set<EtapesDemandes> findByEtapesDemandesType(DemandesType demandestype);
	
	Set<EtapesDemandes> findByEtapesDemandesActeurType(ActeurType acteurType);
	
	 EtapesDemandes findEtapeByetapesDemandesOrdre(Integer etapesDemandesOrdre);

}
