package xtensus.stage.GReclamation.service.impl;

import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xtensus.stage.GReclamation.Repositories.DemandestypeRepository;
import xtensus.stage.GReclamation.entities.DemandesType;
import xtensus.stage.GReclamation.service.DemandestypeService;

@Service
public class DemandestypeServiceImpl implements DemandestypeService{
	
	@Autowired
	private DemandestypeRepository demandestypeRepository;

	@Override
	public DemandesType createDemandestype(DemandesType demandestype) {
		
		return this.demandestypeRepository.save(demandestype);
	}

	@Override
	public DemandesType updateDemandestype(DemandesType demandestype) {
	
		return this.demandestypeRepository.save(demandestype);
	}

	@Override
	public Set<DemandesType> getDemandestypes() {
		 
		return new LinkedHashSet<>(this.demandestypeRepository.findAll());
	}

	@Override
	public DemandesType getDemandesType(Integer demandeTypeId) {
		
		return this.demandestypeRepository.findById(demandeTypeId).get();
	}

	@Override
	public void delete(Integer demandeTypeId) {
		DemandesType demandestype = new DemandesType();
		demandestype.setDemandeTypeId(demandeTypeId);
		this.demandestypeRepository.delete(demandestype); 
	}

}
