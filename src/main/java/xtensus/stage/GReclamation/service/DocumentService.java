package xtensus.stage.GReclamation.service;


import java.util.List;
import java.util.Set;

import xtensus.stage.GReclamation.entities.Document;

public interface DocumentService {
	public List<Document> createDocument(Set<Document> documents);
	
	public Document updateDocument(Document document);
	
	public Set<Document> getDocuments();
	
	public Document getDocument(Integer documentId);
	
	public void delete(Integer documentId);
	
	
}
