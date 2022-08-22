package xtensus.stage.GReclamation.service;

import java.util.Set;

import xtensus.stage.GReclamation.entities.DocumentCategorie;


public interface DocumentCategorieService {
	
	public DocumentCategorie createDocumentCategorie(DocumentCategorie documentCategorie);
	
	public DocumentCategorie updateDocumentCategorie(DocumentCategorie documentCategorie);
	
	public Set<DocumentCategorie> getDocumentCategories();
	
	public DocumentCategorie getDocumentCategorie(Integer documentCategorieId);
	
	public void delete(Integer documentCategorieId);

}
