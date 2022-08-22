package xtensus.stage.GReclamation.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import xtensus.stage.GReclamation.entities.Plainte;

@Repository
public interface FileUploadRepository extends JpaRepository<Plainte, Long>{

}
