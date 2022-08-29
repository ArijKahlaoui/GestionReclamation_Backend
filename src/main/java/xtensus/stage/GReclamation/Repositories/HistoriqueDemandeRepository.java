package xtensus.stage.GReclamation.Repositories;



import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xtensus.stage.GReclamation.entities.HistoriqueDemande;
import xtensus.stage.GReclamation.entities.Plainte;

@Repository
public interface HistoriqueDemandeRepository extends JpaRepository<HistoriqueDemande, Integer>{

	Set<HistoriqueDemande> findByPlainte(Plainte plainte);


}
