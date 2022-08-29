package xtensus.stage.GReclamation.controllers;

import java.util.Date;
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
import xtensus.stage.GReclamation.entities.HistoriqueDemande;
import xtensus.stage.GReclamation.entities.Plainte;
import xtensus.stage.GReclamation.service.HistoriqueDemandeService;
import xtensus.stage.GReclamation.service.PlainteService;

@RestController
@RequestMapping("/historique")
@CrossOrigin("*")
public class HistoriqueDemandeController {
	
	@Autowired
	private HistoriqueDemandeService historiqueDemandeService;
	
	@Autowired
	private PlainteService plainteService;
	
		
		
	//get and create
	@GetMapping("/{plainteId}")
	public ResponseEntity<?> getHistorique(@PathVariable("plainteId") Integer plainteId) {
	
		//historiqueDemandeService.createHistorique(this.historiqueDemandeService.findDateFinPrevue(plainteId));
		
		return ResponseEntity.ok( this.historiqueDemandeService.findDateFinPrevue(plainteId));
		
	}
	
	
	//get all etape of type
	@GetMapping("/historiqueP/{plainteId}")
	public ResponseEntity<?> getHistoriqueOfPlainte(@PathVariable("plainteId") Integer plainteId){
		Plainte plainte = new Plainte();
		plainte.setPlainteId(plainteId);
		Set<HistoriqueDemande> historiquesOfPlainte = this.historiqueDemandeService.getHistoriqueOfPlainte(plainte);
		return ResponseEntity.ok(historiquesOfPlainte);
			
	}
	
	/*@GetMapping("/{plainteId}")
	public ResponseEntity<?> getHistoriqueOfPlainte(@PathVariable("plainteId") Integer plainteId){
		
		this.historiqueDemandeService.findDateFinPrevue(plainteId);
		
		this.historiqueDemandeService.getHistoriqueOfPlainte());
		return ResponseEntity.ok()
	}*/
	

}
