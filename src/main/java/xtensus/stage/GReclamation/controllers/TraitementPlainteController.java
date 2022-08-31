package xtensus.stage.GReclamation.controllers;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import xtensus.stage.GReclamation.entities.DemandesType;
import xtensus.stage.GReclamation.entities.EtapesDemandes;
import xtensus.stage.GReclamation.entities.Plainte;
import xtensus.stage.GReclamation.entities.TraitementPlainte;
import xtensus.stage.GReclamation.service.TraitementPlainteService;

@RestController
@RequestMapping("/traitement")
@CrossOrigin("*")
public class TraitementPlainteController {
	
	@Autowired
	private TraitementPlainteService traitementPlainteService;  
	
	
	//add
	@PostMapping("/")
	public ResponseEntity<TraitementPlainte> createTraitementPlainte(@RequestBody TraitementPlainte traitementPlainte){
		TraitementPlainte traitementPlainte1 = this.traitementPlainteService.createTraitement(traitementPlainte);
		return ResponseEntity.ok(traitementPlainte1);
	}
	
	
	//get all etape of type
	@GetMapping("/{plainteId}")
	public ResponseEntity<?> getEtapeOfType(@PathVariable("plainteId") Integer plainteId){
		Plainte plainte = new Plainte();
		plainte.setPlainteId(plainteId);
		Set<TraitementPlainte> traitementOfPlainte = this.traitementPlainteService.getTraitementOfPlainte(plainte);
		return ResponseEntity.ok(traitementOfPlainte);
			
		}

}
