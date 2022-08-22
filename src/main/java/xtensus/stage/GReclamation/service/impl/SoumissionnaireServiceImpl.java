package xtensus.stage.GReclamation.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xtensus.stage.GReclamation.Repositories.SoumissionnaireRepository;
import xtensus.stage.GReclamation.entities.Soumissionnaire;
import xtensus.stage.GReclamation.service.SoumissionnaireService;

@Service
public class SoumissionnaireServiceImpl implements SoumissionnaireService {
	
	@Autowired SoumissionnaireRepository soumissionnaireRepository;
	

	@Override
	public Soumissionnaire getSoumissionnaire(Integer soumissionnaireReference) {
		
		return this.soumissionnaireRepository.findById(soumissionnaireReference).get();
	}

}
