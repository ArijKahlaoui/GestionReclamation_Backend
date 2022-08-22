package xtensus.stage.GReclamation.service;

import java.util.Set;

import xtensus.stage.GReclamation.entities.Decision;

public interface DecisionService {
	
	public Decision createDecision(Decision decision);
	
	public Decision updateDecision(Decision decision);
	
	public Set<Decision> getDecisions();
	
	public Decision getDecision(Integer decisionId);
	
	public void delete(Integer decisionId);
}
