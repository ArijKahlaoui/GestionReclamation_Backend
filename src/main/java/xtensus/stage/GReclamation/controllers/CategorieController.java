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

import xtensus.stage.GReclamation.entities.Categorie;
import xtensus.stage.GReclamation.service.CategorieService;

@RestController
@RequestMapping("/categorie")
@CrossOrigin("*")
public class CategorieController {
	
	@Autowired
	private CategorieService categorieService;
	
	// add
	@PostMapping("/")
	public ResponseEntity<Categorie> createCategorie(@RequestBody Categorie categorie){
		Categorie categorie1 = this.categorieService.createCategorie(categorie);
		return ResponseEntity.ok(categorie1);
	}
	
	//get demandeType
	@GetMapping("/{categorieId}")
	public Categorie getCategorie(@PathVariable("categorieId") Integer categorieId) {
		return this.categorieService.getCategorie(categorieId);
	}
	
	
	//get all demandes
	@GetMapping("/")
	public ResponseEntity<?> getCategories(){
		return ResponseEntity.ok(this.categorieService.getCategories());
	}
	
	
	//update
	@PutMapping("/")
	public ResponseEntity<Categorie> updateCategorie(@RequestBody Categorie categorie) {
		return ResponseEntity.ok(this.categorieService.updateCategorie(categorie)) ;
	}
		
	//delete
	@DeleteMapping("/{categorieId}")
	public void delete(@PathVariable("categorieId") Integer categorieId) {
		this.categorieService.delete(categorieId);
	}
	
	
	
}
