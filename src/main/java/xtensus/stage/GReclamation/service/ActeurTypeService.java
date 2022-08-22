package xtensus.stage.GReclamation.service;

import java.util.Set;

import xtensus.stage.GReclamation.entities.ActeurType;

public interface ActeurTypeService {
	
	public ActeurType createActeurType(ActeurType acteurType);
	
	public ActeurType updateActeurType(ActeurType acteurType);
	
	public Set<ActeurType> getActeursType();
	
	public ActeurType getActeurType(Integer acteurTypeId);
	
	public void delete(Integer acteurTypeId);

}
