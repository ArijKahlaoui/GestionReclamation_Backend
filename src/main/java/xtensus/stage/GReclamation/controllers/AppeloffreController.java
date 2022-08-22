package xtensus.stage.GReclamation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import xtensus.stage.GReclamation.entities.Appeloffre;
import xtensus.stage.GReclamation.service.AppeloffreService;

@RestController
@RequestMapping("/appel")
@CrossOrigin("*")
public class AppeloffreController {
	@Autowired
	private AppeloffreService appeloffreService;

	@GetMapping("/{appelOffreReference}")
	public Appeloffre getAppeloffre(@PathVariable("appelOffreReference")Integer appelOffreReference) {
		return this.appeloffreService.getAppeloffre(appelOffreReference);
	}
}
