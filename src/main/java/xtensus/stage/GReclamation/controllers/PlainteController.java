package xtensus.stage.GReclamation.controllers;

import java.util.Set;

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

import xtensus.stage.GReclamation.entities.Appeloffre;
import xtensus.stage.GReclamation.entities.DemandesType;
import xtensus.stage.GReclamation.entities.EtapesDemandes;
import xtensus.stage.GReclamation.entities.Plainte;
import xtensus.stage.GReclamation.service.DocumentService;
import xtensus.stage.GReclamation.service.HistoriqueDemandeService;
import xtensus.stage.GReclamation.service.PlainteService;

@RestController
@RequestMapping("/plainte")
@CrossOrigin("*")
public class PlainteController {
	@Autowired
	private PlainteService plainteService;
	
	@Autowired
	private HistoriqueDemandeService historiqueDemandeService;
	
	
	//add
	@PostMapping("/")
	public ResponseEntity<Plainte> createPlainte(@RequestBody Plainte plainte){
		Plainte plainte1 = this.plainteService.createPlainte(plainte);
		historiqueDemandeService.createHistorique(this.historiqueDemandeService.findDateFinPrevue(plainte1.getPlainteId()));
		return ResponseEntity.ok(plainte1);
	}
		
		//get Etat
		@GetMapping("/{plainteId}")
		public Plainte getPlainte(@PathVariable("plainteId") Integer plainteId) {
			return this.plainteService.getPlainte(plainteId);
		}
		
		//get all etat
		@GetMapping("/")
		public ResponseEntity<?> getPlaintes(){
			return ResponseEntity.ok(this.plainteService.getPlainte());
		}
		
		//update
		@PutMapping("/")
		public ResponseEntity<Plainte> updatePlainte(@RequestBody Plainte plainte){
			return ResponseEntity.ok(this.plainteService.updatePlainte(plainte));
		}
		
		//delete 
		@DeleteMapping("/{plainteId}")
		public void delete(@PathVariable("plainteId") Integer plainteId) {
			this.plainteService.delete(plainteId);
		}
		
		
	
		

}
