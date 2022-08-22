package xtensus.stage.GReclamation.service;

import java.util.Set;

import xtensus.stage.GReclamation.entities.DemandesType;

public interface DemandestypeService {
	
	public DemandesType createDemandestype(DemandesType demandestype);
	
	public DemandesType updateDemandestype(DemandesType demandestype);
	
	public Set<DemandesType> getDemandestypes();
	
	public DemandesType getDemandesType(Integer demandeTypeId);
	
	public void delete(Integer demandeTypeId);
}
