package xtensus.stage.GReclamation.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xtensus.stage.GReclamation.Repositories.AppeloffreRepository;
import xtensus.stage.GReclamation.entities.Appeloffre;
import xtensus.stage.GReclamation.service.AppeloffreService;

@Service
public class AppeloffreServiceImpl implements AppeloffreService{
	
	@Autowired
	private AppeloffreRepository appeloffreRepository;

	@Override
	public Appeloffre getAppeloffre(Integer appelOffreReference) {
		
		return this.appeloffreRepository.findById(appelOffreReference).get();
	}

}
