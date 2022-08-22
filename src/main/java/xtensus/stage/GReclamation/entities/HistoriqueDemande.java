package xtensus.stage.GReclamation.entities;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

@Entity
public class HistoriqueDemande {
	
	private Integer HistoriqueDemandeId;
	private Date HistoriqueDemandeDateDebutPrevue; 
	private Date HistoriqueDemandeDateFinPrevue; 
	private Date HistoriqueDemandeDateDebutReelle;
	private Date HistroriqueDemandeDateFinReelle; 
	private Integer HistoriqueDemandeRetard;           
	private Integer HistoriqueDemandeDureePrevue;      
	private Integer HistoriqueDemandeDureeReelle;    
	private Date HistoriqueDemandeDateValidation;
	private Plainte plainte;
	//private  HistoriqueDemandeDecisionId     //int DEFAULT NULL,
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "plainteId")
	public Plainte getPlainte() {
		return plainte;
	}
	public void setPlainte(Plainte plainte) {
		this.plainte = plainte;
	}
	
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "HistoriqueDemandeId", unique = true, nullable = false)
	public Integer getHistoriqueDemandeId() {
		return HistoriqueDemandeId;
	}
	public HistoriqueDemande() {
		super();
	}
	public void setHistoriqueDemandeId(Integer historiqueDemandeId) {
		HistoriqueDemandeId = historiqueDemandeId;
	}
	
	
	@Temporal(TemporalType.TIMESTAMP)
	@JsonFormat(pattern = "yyyy-mm-dd",shape = Shape.STRING)
	public Date getHistoriqueDemandeDateDebutPrevue() {
		return HistoriqueDemandeDateDebutPrevue;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@JsonFormat(pattern = "yyyy-mm-dd",shape = Shape.STRING)
	public void setHistoriqueDemandeDateDebutPrevue(Date historiqueDemandeDateDebutPrevue) {
		HistoriqueDemandeDateDebutPrevue = historiqueDemandeDateDebutPrevue;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@JsonFormat(pattern = "yyyy-mm-dd",shape = Shape.STRING)
	public Date getHistoriqueDemandeDateFinPrevue() {
		return HistoriqueDemandeDateFinPrevue;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@JsonFormat(pattern = "yyyy-mm-dd",shape = Shape.STRING)
	public void setHistoriqueDemandeDateFinPrevue(Date historiqueDemandeDateFinPrevue) {
		HistoriqueDemandeDateFinPrevue = historiqueDemandeDateFinPrevue;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	 @DateTimeFormat(pattern = "yyy-mm-dd")
	public Date getHistoriqueDemandeDateDebutReelle() {
		return HistoriqueDemandeDateDebutReelle;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@JsonFormat(pattern = "yyyy-mm-dd",shape = Shape.STRING)
	public void setHistoriqueDemandeDateDebutReelle(Date historiqueDemandeDateDebutReelle) {
		HistoriqueDemandeDateDebutReelle = historiqueDemandeDateDebutReelle;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@JsonFormat(pattern = "yyyy-mm-dd",shape = Shape.STRING)
	public Date getHistroriqueDemandeDateFinReelle() {
		return HistroriqueDemandeDateFinReelle;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@JsonFormat(pattern = "yyyy-mm-dd",shape = Shape.STRING)
	public void setHistroriqueDemandeDateFinReelle(Date histroriqueDemandeDateFinReelle) {
		HistroriqueDemandeDateFinReelle = histroriqueDemandeDateFinReelle;
	}
	public Integer getHistoriqueDemandeRetard() {
		return HistoriqueDemandeRetard;
	}
	public void setHistoriqueDemandeRetard(Integer historiqueDemandeRetard) {
		HistoriqueDemandeRetard = historiqueDemandeRetard;
	}
	public Integer getHistoriqueDemandeDureePrevue() {
		return HistoriqueDemandeDureePrevue;
	}
	public void setHistoriqueDemandeDureePrevue(Integer historiqueDemandeDureePrevue) {
		HistoriqueDemandeDureePrevue = historiqueDemandeDureePrevue;
	}
	public Integer getHistoriqueDemandeDureeReelle() {
		return HistoriqueDemandeDureeReelle;
	}
	public void setHistoriqueDemandeDureeReelle(Integer historiqueDemandeDureeReelle) {
		HistoriqueDemandeDureeReelle = historiqueDemandeDureeReelle;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@JsonFormat(pattern = "yyyy-mm-dd",shape = Shape.STRING)
	public Date getHistoriqueDemandeDateValidation() {
		return HistoriqueDemandeDateValidation;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@JsonFormat(pattern = "yyyy-mm-dd",shape = Shape.STRING)
	public void setHistoriqueDemandeDateValidation(Date historiqueDemandeDateValidation) {
		HistoriqueDemandeDateValidation = historiqueDemandeDateValidation;
	}

	
}
