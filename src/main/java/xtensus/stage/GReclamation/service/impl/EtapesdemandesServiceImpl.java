package xtensus.stage.GReclamation.service.impl;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xtensus.stage.GReclamation.Repositories.EtapesdemandesRepository;
import xtensus.stage.GReclamation.entities.ActeurType;
import xtensus.stage.GReclamation.entities.DemandesType;
import xtensus.stage.GReclamation.entities.EtapesDemandes;

import xtensus.stage.GReclamation.service.EtapesdemandesService;

@Service
public class EtapesdemandesServiceImpl implements EtapesdemandesService{
	
	@Autowired
	private EtapesdemandesRepository etapesdemandesRepository; 

	@Override
	public EtapesDemandes createEtapesdemandes(EtapesDemandes etapesdemandes) {
		
		return this.etapesdemandesRepository.save(etapesdemandes);
	}

	@Override
	public EtapesDemandes updateEtapesdemandes(EtapesDemandes etapesdemandes) {
		
		return this.etapesdemandesRepository.save(etapesdemandes);
	}
	
	@Override
	public EtapesDemandes updateEtapesDemandesOrdre(Integer etapesDemandesOrdre) {
		EtapesDemandes etapesdemandes = new EtapesDemandes();
		etapesdemandes.setEtapesDemandesOrdre(etapesDemandesOrdre);
		return this.etapesdemandesRepository.save(etapesdemandes);
	}

	@Override
	public Set<EtapesDemandes> getEtapesdemandes() {
		
		return new HashSet<>(this.etapesdemandesRepository.findAll());
	}

	@Override
	public EtapesDemandes getEtapesdemandes(Integer etapesDemandesId) {
		
		return this.etapesdemandesRepository.findById(etapesDemandesId).get();
	}

	@Override
	public void delete(Integer etapesDemandesId) {
		EtapesDemandes etapesdemandes = new EtapesDemandes();
		etapesdemandes.setEtapesDemandesId(etapesDemandesId);
		this.etapesdemandesRepository.delete(etapesdemandes);
		
	}

	@Override
	public Set<EtapesDemandes> getEtapeOfType(DemandesType demandestype) {
		
		return this.etapesdemandesRepository.findByEtapesDemandesType(demandestype);
	}

	@Override
	public Set<EtapesDemandes> getEtapeOfActeurType(ActeurType acteurType) {
		
		return this.etapesdemandesRepository.findByEtapesDemandesActeurType(acteurType);
	}

	@Override
	public EtapesDemandes findEtapeByetapesDemandesOrdre(Integer etapesDemandesOrdre) {
		
		return this.etapesdemandesRepository.findEtapeByetapesDemandesOrdre(etapesDemandesOrdre);
	}

	
	
	

}
