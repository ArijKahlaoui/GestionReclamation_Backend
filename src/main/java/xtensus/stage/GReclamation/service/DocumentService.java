package xtensus.stage.GReclamation.service;


import java.util.Collection;
import java.util.Set;

import xtensus.stage.GReclamation.entities.Document;
import xtensus.stage.GReclamation.entities.Plainte;

public interface DocumentService {
	public Document createDocument(Document document);
	
	public Document updateDocument(Document document);
	
	public Set<Document> getDocuments();
	
	public Document getDocument(Integer documentId);
	
	public void delete(Integer documentId);
	
	
}
