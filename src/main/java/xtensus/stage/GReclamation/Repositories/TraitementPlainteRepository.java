package xtensus.stage.GReclamation.Repositories;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import xtensus.stage.GReclamation.entities.Plainte;
import xtensus.stage.GReclamation.entities.TraitementPlainte;

@Repository
public interface TraitementPlainteRepository extends JpaRepository<TraitementPlainte,Integer>{

	Set<TraitementPlainte> findByPlainte(Plainte plainte);
}
