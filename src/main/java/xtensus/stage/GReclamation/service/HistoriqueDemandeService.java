package xtensus.stage.GReclamation.service;


import java.util.List;
import java.util.Set;


import xtensus.stage.GReclamation.entities.HistoriqueDemande;
import xtensus.stage.GReclamation.entities.Plainte;


public interface HistoriqueDemandeService {
	
	public Set<HistoriqueDemande> findDateFinPrevue(Integer plainterId);
	
	public List<HistoriqueDemande> createHistorique(Set<HistoriqueDemande> historiqueDemandes);
	
	public Set<HistoriqueDemande> getHistoriqueOfPlainte(Plainte plainte);
}
