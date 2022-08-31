package xtensus.stage.GReclamation.service.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xtensus.stage.GReclamation.Repositories.TraitementPlainteRepository;
import xtensus.stage.GReclamation.entities.Plainte;
import xtensus.stage.GReclamation.entities.TraitementPlainte;
import xtensus.stage.GReclamation.service.TraitementPlainteService;

@Service
public class TraitementPlainteServiceImpl implements TraitementPlainteService{

	@Autowired
	private TraitementPlainteRepository traitementPlainteRepository;
	
	@Override
	public TraitementPlainte createTraitement(TraitementPlainte traitement) {
		
		return this.traitementPlainteRepository.save(traitement);
	}

	@Override
	public Set<TraitementPlainte> getTraitementOfPlainte(Plainte plainte) {
		
		return this.traitementPlainteRepository.findByPlainte(plainte);
	}

	@Override
	public TraitementPlainte getTraitement(Integer traitementId) {
		
		return this.traitementPlainteRepository.findById(traitementId).get();
	}

}
