package xtensus.stage.GReclamation.service;

import java.util.Set;

import xtensus.stage.GReclamation.entities.EtatSuivi;

public interface EtatSuiviService {
	
	public EtatSuivi createEtatSuivi(EtatSuivi etatSuivi);
	
	public EtatSuivi updateEtatSuivi(EtatSuivi etatSuivi);
	
	public Set<EtatSuivi> getEtatsSuivi();
	
	public EtatSuivi getEtatSuivi(Long etatSuiviId);
	
	public void delete(Long etatSuiviId);
}
