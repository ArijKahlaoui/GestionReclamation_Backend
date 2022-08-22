package xtensus.stage.GReclamation.service;

import java.util.Set;

import xtensus.stage.GReclamation.entities.ActeurType;
import xtensus.stage.GReclamation.entities.DemandesType;
import xtensus.stage.GReclamation.entities.EtapesDemandes;


public interface EtapesdemandesService {
	
	public EtapesDemandes createEtapesdemandes(EtapesDemandes etapesdemandes);
	
	public EtapesDemandes updateEtapesdemandes(EtapesDemandes etapesdemandes);
	
	public EtapesDemandes updateEtapesDemandesOrdre(Integer etapesDemandesOrdre);
	
	public Set<EtapesDemandes> getEtapesdemandes();
	
	public EtapesDemandes getEtapesdemandes(Integer etapesDemandesId);
	
	public void delete(Integer etapesDemandesId);
	
	public Set<EtapesDemandes> getEtapeOfType(DemandesType demandestype);
	
	public Set<EtapesDemandes> getEtapeOfActeurType(ActeurType acteurType);
	
	public EtapesDemandes findEtapeByetapesDemandesOrdre(Integer etapesDemandesOrdre);

}
