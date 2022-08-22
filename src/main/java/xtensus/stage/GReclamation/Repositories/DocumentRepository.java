package xtensus.stage.GReclamation.Repositories;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import xtensus.stage.GReclamation.entities.Document;
import xtensus.stage.GReclamation.entities.Plainte;
@Repository
public interface DocumentRepository extends JpaRepository<Document, Integer>{

	
}
