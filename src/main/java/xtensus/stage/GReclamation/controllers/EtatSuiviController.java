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

import xtensus.stage.GReclamation.entities.EtatSuivi;
import xtensus.stage.GReclamation.service.EtatSuiviService;

@RestController
@RequestMapping("/etat")
@CrossOrigin("*")
public class EtatSuiviController {
	
	@Autowired
	private EtatSuiviService etatSuiviService;
	
	//add
	@PostMapping("/")
	public ResponseEntity<EtatSuivi> createEtatSuivi(@RequestBody EtatSuivi etatSuivi){
		EtatSuivi etatSuivi1 = this.etatSuiviService.createEtatSuivi(etatSuivi);
		return ResponseEntity.ok(etatSuivi1);
	}
	
	//get Etat
	@GetMapping("/{etatSuiviId}")
	public EtatSuivi getEtatSuivi(@PathVariable("etatSuiviId") Long etatSuiviId) {
		return this.etatSuiviService.getEtatSuivi(etatSuiviId);
	}
	
	//get all etat
	@GetMapping("/")
	public ResponseEntity<?> getEtatsSuivi(){
		return ResponseEntity.ok(this.etatSuiviService.getEtatsSuivi());
	}
	
	//update
	@PutMapping("/")
	public ResponseEntity<EtatSuivi> updateEtatSuivi(@RequestBody EtatSuivi etatSuivi){
		return ResponseEntity.ok(this.etatSuiviService.updateEtatSuivi(etatSuivi));
	}
	
	//delete 
	@DeleteMapping("/{etatSuiviId}")
	public void delete(@PathVariable("etatSuiviId") Long etatSuiviId) {
		this.etatSuiviService.delete(etatSuiviId);
	}
}
