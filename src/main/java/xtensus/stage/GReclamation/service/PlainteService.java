package xtensus.stage.GReclamation.service;

import java.util.Set;

import xtensus.stage.GReclamation.entities.Appeloffre;
import xtensus.stage.GReclamation.entities.DemandesType;
import xtensus.stage.GReclamation.entities.EtapesDemandes;
import xtensus.stage.GReclamation.entities.Plainte;

public interface PlainteService{
	
	public Plainte createPlainte(Plainte plainte);
	
	public Plainte updatePlainte(Plainte plainte);
	
	public Set<Plainte> getPlainte();
	
	public Plainte getPlainte(Integer plainteId);
	
	public void delete(Integer plainteId);
	
	//public Appeloffre  getAppelOfPlainteId(Integer plaintId);
	
	
}
