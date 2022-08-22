package xtensus.stage.GReclamation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import xtensus.stage.GReclamation.entities.Soumissionnaire;
import xtensus.stage.GReclamation.service.SoumissionnaireService;

@RestController
@RequestMapping("/soumissionnaire")
@CrossOrigin("*")
public class SoumissionnaireController {
	@Autowired
	private SoumissionnaireService soumissionnaireService;
	
	@GetMapping("/{soumissionnaireReference}")
	public Soumissionnaire getSoumissionnaire(@PathVariable("soumissionnaireReference") Integer soumissionnaireReference) {
		return this.soumissionnaireService.getSoumissionnaire(soumissionnaireReference);	
	}

}
