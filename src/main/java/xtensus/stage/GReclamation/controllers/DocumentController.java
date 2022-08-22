package xtensus.stage.GReclamation.controllers;


import java.util.Collection;

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

import xtensus.stage.GReclamation.entities.Document;

import xtensus.stage.GReclamation.service.DocumentService;

@RestController
@RequestMapping("/document")
@CrossOrigin("*")
public class DocumentController {
	
	

	@Autowired
	private DocumentService documentService;
	
	
	
	//add
	@PostMapping("/")
	public ResponseEntity<Document> createDocument(@RequestBody Document document){
		Document document1 = this.documentService.createDocument(document);
		return ResponseEntity.ok(document1);
	}

	
	//update
	@PutMapping("/")
	public ResponseEntity<Document> updateDocument(@RequestBody Document document){
		return ResponseEntity.ok(this.documentService.updateDocument(document));
	}
	
	//all 
	@GetMapping("/")
	public ResponseEntity<?> getDocuments(){
		return ResponseEntity.ok(this.documentService.getDocuments());
	}
	
	
	@GetMapping("/{documentId}")
	public Document getDocument(@PathVariable("documentId") Integer documentId) {
		return this.documentService.getDocument(documentId);
	}
	
	
	//delete
	@DeleteMapping("/{documentId}")
	public void delete(@PathVariable("documentId") Integer documentId) {
		this.documentService.delete(documentId);
	}
	
}
