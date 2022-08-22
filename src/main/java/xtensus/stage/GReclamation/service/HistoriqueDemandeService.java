package xtensus.stage.GReclamation.service;

import java.util.Date;

import xtensus.stage.GReclamation.entities.HistoriqueDemande;


public interface HistoriqueDemandeService {
	public HistoriqueDemande findDateFinPrevue(Integer plainterId);

}
