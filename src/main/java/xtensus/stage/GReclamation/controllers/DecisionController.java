package xtensus.stage.GReclamation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import xtensus.stage.GReclamation.entities.Decision;
import xtensus.stage.GReclamation.service.DecisionService;

@RestController
@RequestMapping("/decision")
@CrossOrigin("*")
public class DecisionController {
	
	@Autowired
	private DecisionService decisionService; 
	
	//add
	@PostMapping("/")
	public ResponseEntity<Decision> createDecision(@RequestBody Decision decision){
		Decision decision1 = this.decisionService.createDecision(decision);
		return ResponseEntity.ok(decision1);
	}
	
	//get decision
	@GetMapping("/{decisionId}")
	public Decision getDecision(@PathVariable("decisionId") Integer decisionId) {
		return this.decisionService.getDecision(decisionId);
	}
	
	//all decision
	@GetMapping("/")
	public ResponseEntity<?> getDecisions(){
		return ResponseEntity.ok(this.decisionService.getDecisions());
	}

	
	//update 
	@PutMapping("/")
	public ResponseEntity<Decision> updateDecision(@RequestBody Decision decision){
		return ResponseEntity.ok(this.decisionService.updateDecision(decision));
	}
	
	//delete
	@DeleteMapping("/{decisionId}")
	public void delete(@PathVariable("decisionId") Integer decisionId) {
		this.decisionService.delete(decisionId);
	}
	
}
