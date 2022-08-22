package xtensus.stage.GReclamation.service.impl;


import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import xtensus.stage.GReclamation.Repositories.HistoriqueDemandeRepository;
import xtensus.stage.GReclamation.entities.DemandesType;
import xtensus.stage.GReclamation.entities.EtapesDemandes;
import xtensus.stage.GReclamation.entities.HistoriqueDemande;
import xtensus.stage.GReclamation.entities.Plainte;
import xtensus.stage.GReclamation.service.EtapesdemandesService;
import xtensus.stage.GReclamation.service.HistoriqueDemandeService;

@Service
public class HistoriqueDemandeServiceImpl implements HistoriqueDemandeService{
	
	@Autowired
	private HistoriqueDemandeRepository historiqueDemandeRepository;

	@Autowired
	private EtapesdemandesService etapesdemandesService;
	
	@Override
	public HistoriqueDemande findDateFinPrevue(Integer plainterId) {
		Plainte plainte = new Plainte();
		HistoriqueDemande historiqueDemande = new HistoriqueDemande(); 
		
		plainte.setPlainteId(plainterId);
		historiqueDemande.setHistoriqueDemandeDateDebutPrevue(plainte.getPlainteDate());
		
		Set<EtapesDemandes> etapes = etapesdemandesService.getEtapeOfType(plainte.getDemandesType());
		
		
		Integer duree=0;
		for (EtapesDemandes etape: etapes) {
			duree = duree + etape.getEtapesDemandesDelaiExecution();
		}
		
		Date DateDebutPrevue = historiqueDemande.getHistoriqueDemandeDateDebutPrevue();
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(DateDebutPrevue);
		calendar.add(Calendar.DATE, duree);
		Date DateFinPrevue = calendar.getTime();
		
		historiqueDemande.setHistoriqueDemandeDateFinPrevue(DateFinPrevue);
				
		return historiqueDemande;
	}

	
	
	

}
