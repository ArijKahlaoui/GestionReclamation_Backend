package xtensus.stage.GReclamation.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import xtensus.stage.GReclamation.entities.ActeurType;

@Repository
public interface ActeurtypeRepository extends JpaRepository<ActeurType,Integer> {

}
