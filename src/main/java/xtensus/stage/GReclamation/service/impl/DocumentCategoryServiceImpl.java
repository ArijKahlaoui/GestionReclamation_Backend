package xtensus.stage.GReclamation.service.impl;

import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xtensus.stage.GReclamation.Repositories.DocumentCategorieRepository;
import xtensus.stage.GReclamation.entities.DocumentCategorie;
import xtensus.stage.GReclamation.service.DocumentCategorieService;

@Service
public class DocumentCategoryServiceImpl implements DocumentCategorieService{
	
	@Autowired
	private DocumentCategorieRepository documentCategorieRepository;

	@Override
	public DocumentCategorie createDocumentCategorie(DocumentCategorie documentCategorie) {
		
		return this.documentCategorieRepository.save(documentCategorie);
	}

	@Override
	public DocumentCategorie updateDocumentCategorie(DocumentCategorie documentCategorie) {
		
		return this.documentCategorieRepository.save(documentCategorie);
	}

	@Override
	public Set<DocumentCategorie> getDocumentCategories() {
		
		return new LinkedHashSet<>(this.documentCategorieRepository.findAll());
	}

	@Override
	public DocumentCategorie getDocumentCategorie(Integer documentCategorieId) {
		
		return this.documentCategorieRepository.findById(documentCategorieId).get();
	}

	@Override
	public void delete(Integer documentCategorieId) {
		DocumentCategorie  documentCategorie = new DocumentCategorie();
		documentCategorie.setDocumentCategorieId(documentCategorieId);
		this.documentCategorieRepository.delete(documentCategorie);
		
	}

}
