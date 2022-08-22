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

import xtensus.stage.GReclamation.entities.DemandesType;
import xtensus.stage.GReclamation.service.DemandestypeService;


@RestController
@RequestMapping("/demande")
@CrossOrigin("*")
public class DemandestypeController {
	
	@Autowired
	private DemandestypeService demandestypeService;
	
	// add
	@PostMapping("/")
	public ResponseEntity<DemandesType> createDemandestype(@RequestBody DemandesType demandestype){
		DemandesType demandestype1 = this.demandestypeService.createDemandestype(demandestype);
		return ResponseEntity.ok(demandestype1);
	}
	
	//get demandeType
	@GetMapping("/{demandeTypeId}")
	public DemandesType getDemandestype(@PathVariable("demandeTypeId") Integer demandeTypeId) {
		return this.demandestypeService.getDemandesType(demandeTypeId);
	}
	
	//get all demandes
	@GetMapping("/")
	public ResponseEntity<?> getDemandestypes(){
		return ResponseEntity.ok(this.demandestypeService.getDemandestypes());
	}
	
	
	//update
	@PutMapping("/")
	public ResponseEntity<DemandesType> updateDemandestype(@RequestBody DemandesType demandestype) {
		return ResponseEntity.ok(this.demandestypeService.updateDemandestype(demandestype)) ;
	}
	
	
	//delete
	@DeleteMapping("/{demandeTypeId}")
	public void delete(@PathVariable("demandeTypeId") Integer demandeTypeId) {
		this.demandestypeService.delete(demandeTypeId);
	}
	
}
