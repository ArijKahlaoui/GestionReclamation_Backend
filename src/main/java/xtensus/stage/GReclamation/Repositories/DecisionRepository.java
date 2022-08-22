package xtensus.stage.GReclamation.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import xtensus.stage.GReclamation.entities.Decision;

@Repository
public interface DecisionRepository extends JpaRepository<Decision,Integer> {

}
