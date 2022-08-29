package xtensus.stage.GReclamation.service.impl;


import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import xtensus.stage.GReclamation.Repositories.HistoriqueDemandeRepository;
import xtensus.stage.GReclamation.Repositories.PlainteRepository;
import xtensus.stage.GReclamation.entities.DemandesType;
import xtensus.stage.GReclamation.entities.EtapesDemandes;
import xtensus.stage.GReclamation.entities.HistoriqueDemande;
import xtensus.stage.GReclamation.entities.Plainte;
import xtensus.stage.GReclamation.service.EtapesdemandesService;
import xtensus.stage.GReclamation.service.HistoriqueDemandeService;
import xtensus.stage.GReclamation.service.PlainteService;

@Service
public class HistoriqueDemandeServiceImpl implements HistoriqueDemandeService{
	
	@Autowired
	private HistoriqueDemandeRepository historiqueDemandeRepository;
	@Autowired
	private PlainteRepository plainteRepository;

	@Autowired
	private EtapesdemandesService etapesdemandesService;
	
	@Autowired
	private PlainteService plainteService;
	
	@Override
	public List<HistoriqueDemande> createHistorique(Set<HistoriqueDemande> historiqueDemandes) {
		
			return this.historiqueDemandeRepository.saveAll(historiqueDemandes);
	}
	
	@Override
	public Set<HistoriqueDemande> findDateFinPrevue(Integer plainterId) {
		Plainte plainte = plainteService.getPlainte(plainterId);
		Set<HistoriqueDemande> historiqueDemandes = new HashSet<HistoriqueDemande>();;
		//historiqueDemande.setPlainte(plainte);
		
		
		Set<EtapesDemandes> etapes = etapesdemandesService.getEtapeOfType(plainte.getDemandesType());
		Date DateDebutPrevue = plainte.getPlainteDate();
		
		Integer duree = 0;
		for(EtapesDemandes etape : etapes) {
			HistoriqueDemande etapehistoriqueDemande = new  HistoriqueDemande();
			etapehistoriqueDemande.setPlainte(plainte);
			
			//date debut prevue suivant
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(DateDebutPrevue);
			calendar.add(Calendar.DATE, duree);
			DateDebutPrevue= calendar.getTime();
			etapehistoriqueDemande.setHistoriqueDemandeDateDebutPrevue(DateDebutPrevue);
			
			
			duree = etape.getEtapesDemandesDelaiExecution();
			//calcul fin prevue
			
			calendar.setTime(DateDebutPrevue);
			calendar.add(Calendar.DATE, duree-1);
			Date DateFinPrevue = calendar.getTime();
			etapehistoriqueDemande.setHistoriqueDemandeDateFinPrevue(DateFinPrevue);
			etapehistoriqueDemande.setHistoriqueDemandeDureePrevue(etape.getEtapesDemandesDelaiExecution());
			//etape.setHistoriqueDemande(etapehistoriqueDemande);
			historiqueDemandes.add(etapehistoriqueDemande);
			
		}
		
		//Set<HistoriqueDemande> historiques = plainte.getHistoriques(); 
		return historiqueDemandes;
	}

	@Override
	public Set<HistoriqueDemande> getHistoriqueOfPlainte(Plainte plainte) {
		
		return this.historiqueDemandeRepository.findByPlainte(plainte);
	}



	


}
