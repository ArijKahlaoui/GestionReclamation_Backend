package xtensus.stage.GReclamation.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import xtensus.stage.GReclamation.entities.HistoriqueDemande;

@Repository
public interface HistoriqueDemandeRepository extends JpaRepository<HistoriqueDemande, Integer>{


}
