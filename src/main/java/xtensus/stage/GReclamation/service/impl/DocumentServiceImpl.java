package xtensus.stage.GReclamation.service.impl;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xtensus.stage.GReclamation.Repositories.DocumentRepository;
import xtensus.stage.GReclamation.entities.Document;
import xtensus.stage.GReclamation.entities.Plainte;
import xtensus.stage.GReclamation.service.DocumentService;

@Service
public class DocumentServiceImpl implements DocumentService {
	
	@Autowired
	private DocumentRepository documentRepository;
	
	@Override
	public List<Document> createDocument(Set<Document> documents) {
		
		return this.documentRepository.saveAll(documents);
	}
	
	
	@Override
	public Document updateDocument(Document document) {
		// TODO Auto-generated method stub
		return this.documentRepository.save(document);
	}

	@Override
	public Set<Document> getDocuments() {
		
		return new LinkedHashSet<>(this.documentRepository.findAll());
	}

	@Override
	public Document getDocument(Integer documentId) {
		// TODO Auto-generated method stub
		return this.documentRepository.findById(documentId).get();
	}

	@Override
	public void delete(Integer documentId) {
		Document document = new Document();
		document.setIdDocument(documentId);
		this.documentRepository.delete(document);
	}

	

}
