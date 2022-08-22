package xtensus.stage.GReclamation.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import xtensus.stage.GReclamation.entities.Categorie;

@Repository
public interface CategorieRepository extends JpaRepository<Categorie,Integer>{

}
