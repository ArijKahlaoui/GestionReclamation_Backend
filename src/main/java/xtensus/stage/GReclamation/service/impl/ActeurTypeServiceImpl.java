package xtensus.stage.GReclamation.service.impl;

import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xtensus.stage.GReclamation.Repositories.ActeurtypeRepository;
import xtensus.stage.GReclamation.entities.ActeurType;
import xtensus.stage.GReclamation.service.ActeurTypeService;

@Service
public class ActeurTypeServiceImpl implements ActeurTypeService{

	@Autowired
	private ActeurtypeRepository acteurtypeRepository;
	
	@Override
	public ActeurType createActeurType(ActeurType acteurType) {
		
		return this.acteurtypeRepository.save(acteurType);
	}

	@Override
	public ActeurType updateActeurType(ActeurType acteurType) {
		
		return this.acteurtypeRepository.save(acteurType);
	}

	@Override
	public Set<ActeurType> getActeursType() {
		
		return new LinkedHashSet<>(this.acteurtypeRepository.findAll());
	}

	@Override
	public ActeurType getActeurType(Integer acteurTypeId) {
		
		return this.acteurtypeRepository.findById(acteurTypeId).get();
	}

	@Override
	public void delete(Integer acteurTypeId) {
		ActeurType acteurType = new ActeurType();
		acteurType.setActeurTypeId(acteurTypeId);
		this.acteurtypeRepository.delete(acteurType);
	}

}
