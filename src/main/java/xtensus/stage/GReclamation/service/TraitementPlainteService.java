package xtensus.stage.GReclamation.service;

import java.util.Set;

import xtensus.stage.GReclamation.entities.Plainte;
import xtensus.stage.GReclamation.entities.TraitementPlainte;

public interface TraitementPlainteService {
	public TraitementPlainte createTraitement(TraitementPlainte traitement);
	
	public Set<TraitementPlainte> getTraitementOfPlainte(Plainte plainte);
	
	public TraitementPlainte getTraitement(Integer traitementId);
}
