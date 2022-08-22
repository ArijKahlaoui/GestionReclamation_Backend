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

import xtensus.stage.GReclamation.entities.DemandesType;
import xtensus.stage.GReclamation.entities.EtapesDemandes;
import xtensus.stage.GReclamation.service.DemandestypeService;
import xtensus.stage.GReclamation.service.EtapesdemandesService;

@RestController
@RequestMapping("/etapeDemande")
@CrossOrigin("*")
public class EtapesdemandesController {
	
	@Autowired
	private EtapesdemandesService etapesdemandesService;
	
	@Autowired
	private DemandestypeService demandestypeService; 
	
	//add
	@PostMapping("/")
	public ResponseEntity<EtapesDemandes> createEtapesdemandes(@RequestBody EtapesDemandes etapesdemandes){
		EtapesDemandes etapesdemandes1 = this.etapesdemandesService.createEtapesdemandes(etapesdemandes);
		return ResponseEntity.ok(etapesdemandes1);
	}		
		
	//get all etapes demandes
	@GetMapping("/")
	public ResponseEntity<?> getEtapes(){
		return ResponseEntity.ok(this.etapesdemandesService.getEtapesdemandes());
	}
	
	
	//get single etape
	@GetMapping("/{etapesDemandesId}")
	public EtapesDemandes get(@PathVariable("etapesDemandesId") Integer etapesDemandesId){
		return this.etapesdemandesService.getEtapesdemandes(etapesDemandesId);
	}
		
		
	//get all etape of type
	@GetMapping("/type/{demandeTypeId}")
	public ResponseEntity<?> getEtapeOfType(@PathVariable("demandeTypeId") Integer demandeTypeId){
		DemandesType demandeType = new DemandesType();
		demandeType.setDemandeTypeId(demandeTypeId);
		Set<EtapesDemandes> etapesOfType = this.etapesdemandesService.getEtapeOfType(demandeType);
		return ResponseEntity.ok(etapesOfType);
		
	}
	
	
	@GetMapping("/order/{etapesDemandesOrdre}")
	public ResponseEntity<?> findEtapeByetapesDemandesOrdre(@PathVariable("etapesDemandesOrdre") Integer etapesDemandesOrdre){
		EtapesDemandes etapesdemandes = new EtapesDemandes();
		etapesdemandes.setEtapesDemandesOrdre(etapesDemandesOrdre);
		EtapesDemandes etapesOfOrder = this.etapesdemandesService.findEtapeByetapesDemandesOrdre(etapesDemandesOrdre);
		return ResponseEntity.ok(etapesOfOrder);
		
	}
	
	//update
	@PutMapping("/")
	public ResponseEntity<EtapesDemandes> updateEtapesdemandes(@RequestBody EtapesDemandes etapesdemandes){
		return ResponseEntity.ok(this.etapesdemandesService.updateEtapesdemandes(etapesdemandes));
	}
	
	@PutMapping("/order")
	public ResponseEntity<EtapesDemandes> updateEtapesDemandesOrdre(@PathVariable("demandeTypeId") Integer demandeTypeId){
		return ResponseEntity.ok(this.etapesdemandesService.updateEtapesDemandesOrdre(demandeTypeId));
	}
		
	//delete
	@DeleteMapping("/{etapesDemandesId}")
	public void delete(@PathVariable("etapesDemandesId") Integer etapesDemandesId) {
		this.etapesdemandesService.delete(etapesDemandesId);
	}
	
	

}
