package xtensus.stage.GReclamation.service.impl;

import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xtensus.stage.GReclamation.Repositories.EtatSuiviRepository;
import xtensus.stage.GReclamation.entities.EtatSuivi;
import xtensus.stage.GReclamation.service.EtatSuiviService;

@Service
public class EtatSuiviServiceImpl implements EtatSuiviService{

	@Autowired
	private EtatSuiviRepository etatSuiviRepository; 
	
	@Override
	public EtatSuivi createEtatSuivi(EtatSuivi etatSuivi) {
		
		return this.etatSuiviRepository.save(etatSuivi);
	}

	@Override
	public EtatSuivi updateEtatSuivi(EtatSuivi etatSuivi) {
		
		return this.etatSuiviRepository.save(etatSuivi);
	}

	@Override
	public Set<EtatSuivi> getEtatsSuivi() {
		
		return new LinkedHashSet<>(this.etatSuiviRepository.findAll());
	}

	@Override
	public EtatSuivi getEtatSuivi(Long etatSuiviId) {
		
		return this.etatSuiviRepository.findById(etatSuiviId).get();
	}

	@Override
	public void delete(Long etatSuiviId) {
		EtatSuivi etatSuivi = new EtatSuivi();
		etatSuivi.setEtatSuiviId(etatSuiviId);
		this.etatSuiviRepository.delete(etatSuivi);
	}

}
