package xtensus.stage.GReclamation.controllers;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import xtensus.stage.GReclamation.entities.HistoriqueDemande;
import xtensus.stage.GReclamation.entities.Plainte;
import xtensus.stage.GReclamation.service.HistoriqueDemandeService;

@RestController
@RequestMapping("/historique")
@CrossOrigin("*")
public class HistoriqueDemandeController {
	
	@Autowired
	private HistoriqueDemandeService historiqueDemandeService;
	
	//get date fin prevue
	@GetMapping("/{plainteId}")
	public HistoriqueDemande getDateFinPrevue(@PathVariable("plainteId") Integer plainteId) {
		return this.historiqueDemandeService.findDateFinPrevue(plainteId);
		
	}
	

}
