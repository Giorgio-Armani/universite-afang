package fr.afang.universite.etudiants.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import fr.afang.universite.note.domain.Note;

@Entity
@Table(name = "t_etudiant")

public class Etudiants {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "numero_etudiant")
	private Integer numero_etudiant;

	@Column(name = "nom")
	private String nom;

	@Column(name = "prenom")
	private String prenom;

	@Column(name = "date_naissance")
	private String date_naissance;

	@Column(name = "sexe")
	private String sexe;

	@OneToMany(mappedBy = "etudiant")
	private List<Note> note;

	public Etudiants() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Etudiants(Integer id, Integer numero_etudiant, String nom, String prenom, String date_naissance,
			String sexe) {
		super();
		this.id = id;
		this.numero_etudiant = numero_etudiant;
		this.nom = nom;
		this.prenom = prenom;
		this.date_naissance = date_naissance;
		this.sexe = sexe;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNumero_etudiant() {
		return numero_etudiant;
	}

	public void setNumero_etudiant(Integer numero_etudiant) {
		this.numero_etudiant = numero_etudiant;
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

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public List<Note> getNote() {
		return note;
	}

	public void setNote(List<Note> note) {
		this.note = note;
	}

}
