package xtensus.stage.GReclamation.service.impl;

import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xtensus.stage.GReclamation.Repositories.PlainteRepository;
import xtensus.stage.GReclamation.entities.Appeloffre;
import xtensus.stage.GReclamation.entities.DemandesType;
import xtensus.stage.GReclamation.entities.EtapesDemandes;
import xtensus.stage.GReclamation.entities.Plainte;
import xtensus.stage.GReclamation.service.PlainteService;

@Service
public class PlainteServiceImpl implements PlainteService{

	@Autowired
	private PlainteRepository plainteRepository;
	
	@Override
	public Plainte createPlainte(Plainte plainte) {
		
		return this.plainteRepository.save(plainte);
	}

	@Override
	public Plainte updatePlainte(Plainte plainte) {
		
		return this.plainteRepository.save(plainte);
	}

	@Override
	public Set<Plainte> getPlainte() {
		
		return new LinkedHashSet<>(this.plainteRepository.findAll());
	}

	@Override
	public Plainte getPlainte(Integer plainte) {
		
		return this.plainteRepository.findById(plainte).get();
	}

	@Override
	public void delete(Integer plainteId) {
		Plainte plainte = new Plainte();
		plainte.setPlainteId(plainteId);
		this.plainteRepository.delete(plainte);
		
	}

	

	

	

}
