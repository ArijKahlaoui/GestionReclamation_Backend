package xtensus.stage.GReclamation.service.impl;

import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xtensus.stage.GReclamation.Repositories.DecisionRepository;
import xtensus.stage.GReclamation.entities.Decision;
import xtensus.stage.GReclamation.service.DecisionService;

@Service
public class DecisionServiceImpl implements DecisionService{
	
	@Autowired
	private DecisionRepository decisionRepository; 

	@Override
	public Decision createDecision(Decision decision) {
		
		return this.decisionRepository.save(decision);
	}

	@Override
	public Decision updateDecision(Decision decision) {
		
		return this.decisionRepository.save(decision);
	}

	@Override
	public Set<Decision> getDecisions() {
		
		return new LinkedHashSet<>(this.decisionRepository.findAll());
	}

	@Override
	public Decision getDecision(Integer decisionId) {
		
		return this.decisionRepository.findById(decisionId).get();
	}

	@Override
	public void delete(Integer decisionId) {
		Decision decision = new Decision();
		decision.setDecisionId(decisionId);
		this.decisionRepository.delete(decision);
		
	}

}
