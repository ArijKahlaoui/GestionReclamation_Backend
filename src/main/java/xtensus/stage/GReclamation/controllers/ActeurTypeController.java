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

import xtensus.stage.GReclamation.entities.ActeurType;
import xtensus.stage.GReclamation.service.ActeurTypeService;

@RestController
@RequestMapping("/acteurType")
@CrossOrigin("*")
public class ActeurTypeController {
	 
	@Autowired
	private ActeurTypeService acteurTypeService;
	
	//add
	@PostMapping("/")
	public ResponseEntity<ActeurType> createDecision(@RequestBody ActeurType acteurtype){
		ActeurType decision1 = this.acteurTypeService.createActeurType(acteurtype);
		return ResponseEntity.ok(decision1);
	}
	
	//get acteur
	@GetMapping("/{acteurTypeId}")
	public ActeurType getDecision(@PathVariable("acteurTypeId") Integer acteurTypeId) {
		return this.acteurTypeService.getActeurType(acteurTypeId);
	}
		
	//all acteurs
	@GetMapping("/")
	public ResponseEntity<?> getDecisions(){
		return ResponseEntity.ok(this.acteurTypeService.getActeursType());
	}

		
	//update 
	@PutMapping("/")
	public ResponseEntity<ActeurType> updateDecision(@RequestBody ActeurType acteurtype){
		return ResponseEntity.ok(this.acteurTypeService.updateActeurType(acteurtype));
	}
		
	//delete
	@DeleteMapping("/{acteurTypeId}")
	public void delete(@PathVariable("acteurTypeId") Integer acteurTypeId) {
		this.acteurTypeService.delete(acteurTypeId);
	}

}
