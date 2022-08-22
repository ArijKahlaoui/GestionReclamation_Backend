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

import xtensus.stage.GReclamation.entities.DocumentCategorie;
import xtensus.stage.GReclamation.service.DocumentCategorieService;


@RestController
@RequestMapping("/documentCategory")
@CrossOrigin("*")
public class DocumentCategorieController {
	
	@Autowired
	private DocumentCategorieService documentCategorieService; 
	
	//add
	@PostMapping("/")
	public ResponseEntity<DocumentCategorie> createDocumentCategorie(@RequestBody DocumentCategorie documentCategorie){
		DocumentCategorie documentCat1 = this.documentCategorieService.createDocumentCategorie(documentCategorie);
		return ResponseEntity.ok(documentCat1);
	}
		
	//update
	@PutMapping("/")
	public ResponseEntity<DocumentCategorie> updateDocumentCategorie(@RequestBody DocumentCategorie documentCategorie){
		return ResponseEntity.ok(this.documentCategorieService.updateDocumentCategorie(documentCategorie));
	}
		
	//all 
	@GetMapping("/")
	public ResponseEntity<?> getDocumentCategories(){
		return ResponseEntity.ok(this.documentCategorieService.getDocumentCategories());
	}
		
	//get 
	@GetMapping("/{documentCategorieId}")
	public DocumentCategorie getDocumentCategorie(@PathVariable("documentCategorieId") Integer documentCategorieId) {
		return this.documentCategorieService.getDocumentCategorie(documentCategorieId);
	}
		
		
	//delete
	@DeleteMapping("/{documentCategorieId}")
	public void delete(@PathVariable("documentCategorieId") Integer documentCategorieId) {
		this.documentCategorieService.delete(documentCategorieId);
	}

}
