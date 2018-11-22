package fr.afang.universite.enseignant.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_enseignant")
public class Enseignant {
    
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id; 
	
	@Column(name = "numero_enseignant")
	private Integer numero_enseignant; 
	
	@Column(name = "Nom")
	private String nom ;    
	
	@Column(name = "PRENOM")
	private String prenom ;   
	
	@Column(name = "date_naissance")
	private String date_naissance ; 
	
	@Column(name= "SEXE")
	private String sexe  ;   
	
	@Column(name = "GRADE")
	private String grade ;    
	
	@Column(name = "date_embauche")
	private String date_embauche;
	public Enseignant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Enseignant(Integer id, Integer numero_enseignant, String nom, String prenom, String date_naissance,
			String sexe, String grade, String date_embauche) {
		super();
		this.id = id;
		this.numero_enseignant = numero_enseignant;
		this.nom = nom;
		this.prenom = prenom;
		this.date_naissance = date_naissance;
		this.sexe = sexe;
		this.grade = grade;
		this.date_embauche = date_embauche;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getNumero_enseignant() {
		return numero_enseignant;
	}
	public void setNumero_enseignant(Integer numero_enseignant) {
		this.numero_enseignant = numero_enseignant;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getDate_naissance() {
		return date_naissance;
	}
	public void setDate_naissance(String date_naissance) {
		this.date_naissance = date_naissance;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getDate_embauche() {
		return date_embauche;
	}
	public void setDate_embauche(String date_embauche) {
		this.date_embauche = date_embauche;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
}
