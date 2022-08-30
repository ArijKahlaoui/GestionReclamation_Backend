package xtensus.stage.GReclamation.entities;

// Generated 22 mars 2013 14:16:14 by Hibernate Tools 3.4.0.Beta1

import java.util.Calendar;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Document generated by hbm2java
 */
@Entity
@Table(name = "document")
public class Document implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5131057865152403686L;
	private Integer idDocument;
	private String documentReference;
	private String documentNom;
	private String documentObjet;
	private String documentCommentaire;
	private String documentType;
	private Integer documentDelegueId;
	private Integer documentProprietaire;
	private Date documentDateInsertion;
	private Integer documentHierarchique;
	private Boolean documentSupprime;
	private Date documentSupprimeDate;
	private Integer documentSupprimeDelegueId;	
	private Document documentParent;
	private String documentNomAR;
	private String documentObjetAR;
	private String documentCommentaireAR;
	private String documentTypeAR;
	private Integer documentIdDocumentOriginal;
	private Integer documentOrdre;
	private DocumentCategorie documentCategorie;
	private Soumissionnaire soumissionnaire;
	private Appeloffre appeloffre;
	private String documentTypeUpload;
	private HistoriqueDemande historiquePlainte;
//	private Document document;

	public Document() {
	}



	public Document(Integer idDocument, String documentReference,
			String documentNom, String documentObjet,
			String documentCommentaire, String documentType,
			Integer documentDelegueId, Integer documentProprietaire,
			Date documentDateInsertion, Integer documentHierarchique,
			Boolean documentSupprime, Date documentSupprimeDate,
			Integer documentSupprimeDelegueId, Document documentParent,
			String documentNomAR, String documentObjetAR,
			String documentCommentaireAR, String documentTypeAR,
			Integer documentIdDocumentOriginal,Integer documentOrdre,DocumentCategorie documentCategorie,Soumissionnaire soumissionnaire
			,HistoriqueDemande historiquePlainte) {
			
		super();
		this.idDocument = idDocument;
		this.documentReference = documentReference;
		this.documentNom = documentNom;
		this.documentObjet = documentObjet;
		this.documentCommentaire = documentCommentaire;
		this.documentType = documentType;
		this.documentDelegueId = documentDelegueId;
		this.documentProprietaire = documentProprietaire;
		this.documentDateInsertion = documentDateInsertion;
		this.documentHierarchique = documentHierarchique;
		this.documentSupprime = documentSupprime;
		this.documentSupprimeDate = documentSupprimeDate;
		this.documentSupprimeDelegueId = documentSupprimeDelegueId;
		this.documentParent = documentParent;
		this.documentNomAR = documentNomAR;
		this.documentObjetAR = documentObjetAR;
		this.documentCommentaireAR = documentCommentaireAR;
		this.documentTypeAR = documentTypeAR;
		this.documentIdDocumentOriginal = documentIdDocumentOriginal;
		
		this.documentOrdre=documentOrdre;
		this.documentCategorie=documentCategorie;
		this.soumissionnaire=soumissionnaire;
		this.historiquePlainte = historiquePlainte;
	}



	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "documentId", unique = true, nullable = false)
	public Integer getIdDocument() {
		return this.idDocument;
	}

	public void setIdDocument(Integer idDocument) {
		this.idDocument = idDocument;
	}
	@Column(name = "documentReference", length = 100)
	public String getDocumentReference() {
		return this.documentReference;
	}

	public void setDocumentReference(String documentReference) {
		this.documentReference = documentReference;
	}

	@Column(name = "documentNom", length = 100)
	public String getDocumentNom() {
		return this.documentNom;
	}

	public void setDocumentNom(String documentNom) {
		this.documentNom = documentNom;
	}

	@Column(name = "documentObjet", length = 100)
	public String getDocumentObjet() {
		return this.documentObjet;
	}

	public void setDocumentObjet(String documentObjet) {
		this.documentObjet = documentObjet;
	}

	@Column(name = "documentCommentaire", length = 1000)
	public String getDocumentCommentaire() {
		return this.documentCommentaire;
	}

	public void setDocumentCommentaire(String documentCommentaire) {
		this.documentCommentaire = documentCommentaire;
	}

	
	
	@Column(name = "documentType", length = 100)
	public String getDocumentType() {
		return this.documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	@Column(name = "documentDelegueId")
	public Integer getDocumentDelegueId() {
		return this.documentDelegueId;
	}

	public void setDocumentDelegueId(Integer documentDelegueId) {
		this.documentDelegueId = documentDelegueId;
	}

	@Column(name = "documentProprietaire")
	public Integer getDocumentProprietaire() {
		return this.documentProprietaire;
	}

	public void setDocumentProprietaire(Integer documentProprietaire) {
		this.documentProprietaire = documentProprietaire;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "documentDateInsertion", length = 10)
	public Date getDocumentDateInsertion() {
		if(documentDateInsertion!=null){
			Calendar cal = Calendar.getInstance();
			  cal.setTime(documentDateInsertion);
			  cal.set(Calendar.MILLISECOND, 0);
			  documentDateInsertion = new java.sql.Timestamp(cal.getTimeInMillis());}
		return this.documentDateInsertion;
	}

	public void setDocumentDateInsertion(Date documentDateInsertion) {
		
		this.documentDateInsertion = documentDateInsertion;
		
	}

	@Column(name = "documentHierarchique")
	public Integer getDocumentHierarchique() {
		return this.documentHierarchique;
	}

	public void setDocumentHierarchique(Integer documentHierarchique) {
		this.documentHierarchique = documentHierarchique;
	}

	@Column(name = "documentSupprime")
	public Boolean getDocumentSupprime() {
		return this.documentSupprime;
	}

	public void setDocumentSupprime(Boolean documentSupprime) {
		this.documentSupprime = documentSupprime;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "documentSupprimeDate", length = 10)
	public Date getDocumentSupprimeDate() {
		return this.documentSupprimeDate;
	}

	public void setDocumentSupprimeDate(Date documentSupprimeDate) {
		this.documentSupprimeDate = documentSupprimeDate;
	}

	@Column(name = "documentSupprimeDelegueId")
	public Integer getDocumentSupprimeDelegueId() {
		return this.documentSupprimeDelegueId;
	}

	public void setDocumentSupprimeDelegueId(Integer documentSupprimeDelegueId) {
		this.documentSupprimeDelegueId = documentSupprimeDelegueId;
	}
	public void setDocumentParent(Document documentParent) {
		this.documentParent = documentParent;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "documentParent")
	public Document getDocumentParent() {
		return documentParent;
	}
	@Column(name = "documentNom_AR", length = 254)
	public String getDocumentNomAR() {
		return documentNomAR;
	}

	public void setDocumentNomAR(String documentNomAR) {
		this.documentNomAR = documentNomAR;
	}
	
	@Column(name = "documentObjet_AR", length = 254)
	public String getDocumentObjetAR() {
		return documentObjetAR;
	}

	public void setDocumentObjetAR(String documentObjetAR) {
		this.documentObjetAR = documentObjetAR;
	}
	@Column(name = "documentCommentaire_AR", length = 65535)
	public String getDocumentCommentaireAR() {
		return documentCommentaireAR;
	}

	public void setDocumentCommentaireAR(String documentCommentaireAR) {
		this.documentCommentaireAR = documentCommentaireAR;
	}

	@Column(name = "documentType_AR", length = 100)
	public String getDocumentTypeAR() {
		return documentTypeAR;
	}

	public void setDocumentTypeAR(String documentTypeAR) {
		this.documentTypeAR = documentTypeAR;
	}
	

	public void setDocumentIdDocumentOriginal(Integer documentIdDocumentOriginal) {
		this.documentIdDocumentOriginal = documentIdDocumentOriginal;
	}
	@Column(name = "documentIdDocumentOriginal")
	public Integer getDocumentIdDocumentOriginal() {
		return documentIdDocumentOriginal;
	}



	

	

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "documentSoumissionnaire")
	public Soumissionnaire getSoumissionnaire() {
		return soumissionnaire;
	}



	public void setDocumentOrdre(Integer documentOrdre) {
		this.documentOrdre = documentOrdre;
	}


	@Column(name = "documentOrdre")
	public Integer getDocumentOrdre() {
		return documentOrdre;
	}



	public void setDocumentCategorie(DocumentCategorie documentCategorie) {
		this.documentCategorie = documentCategorie;
	}


	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "documentCategorieId")
	public DocumentCategorie getDocumentCategorie() {
		return documentCategorie;
	}


	public void setSoumissionnaire(Soumissionnaire soumissionnaire) {
		this.soumissionnaire = soumissionnaire;
	}



	public void setAppeloffre(Appeloffre appeloffre) {
		this.appeloffre = appeloffre;
	}


	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name = "documentAppelOffreId")
	public Appeloffre getAppeloffre() {
		return appeloffre;
	}



	public void setDocumentTypeUpload(String documentTypeUpload) {
		this.documentTypeUpload = documentTypeUpload;
	}



	public String getDocumentTypeUpload() {
		return documentTypeUpload;
	}

	


	public void setHistoriquePlainte(HistoriqueDemande historiquePlainte) {
		this.historiquePlainte = historiquePlainte;
	}


	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "documentPlainteId")
	public HistoriqueDemande getHistoriquePlainte() {
		return historiquePlainte;
	}


}
