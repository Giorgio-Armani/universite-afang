package fr.afang.universite.matiere.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import fr.afang.universite.enseignant.domain.Enseignant;
import fr.afang.universite.note.domain.Note;

@Entity
@Table(name = "t_matiere")

public class Matiere {

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ID;

	@Column(name = "NUMERO_MATIERE")
	private Integer NUMERO_MATIERE;

	@Column(name = "Nom")
	private String Nom;

	@Column(name = "COEF")
	private String COEF;

	@Column(name = "DATE_DEBUT")
	private String DATE_DEBUT;

	@Column(name = "DATE_FIN")
	private String DATE_FIN;

	@OneToOne
	@JoinColumn(name = "ID_ENSEIGNANT")
	private Enseignant enseignant;

	@OneToMany(mappedBy = "matiere")
	private List<Note> note;

	public Matiere() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Matiere(Integer iD, Integer nUMERO_MATIERE, String nom, String cOEF, String dATE_DEBUT, String dATE_FIN,
			String id_enseignant) {
		super();
		ID = iD;
		NUMERO_MATIERE = nUMERO_MATIERE;
		Nom = nom;
		COEF = cOEF;
		DATE_DEBUT = dATE_DEBUT;
		DATE_FIN = dATE_FIN;
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public Integer getNUMERO_MATIERE() {
		return NUMERO_MATIERE;
	}

	public void setNUMERO_MATIERE(Integer nUMERO_MATIERE) {
		NUMERO_MATIERE = nUMERO_MATIERE;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public String getCOEF() {
		return COEF;
	}

	public void setCOEF(String cOEF) {
		COEF = cOEF;
	}

	public String getDATE_DEBUT() {
		return DATE_DEBUT;
	}

	public void setDATE_DEBUT(String dATE_DEBUT) {
		DATE_DEBUT = dATE_DEBUT;
	}

	public String getDATE_FIN() {
		return DATE_FIN;
	}

	public void setDATE_FIN(String dATE_FIN) {
		DATE_FIN = dATE_FIN;
	}

	public Enseignant getEnseignant() {
		return enseignant;
	}

	public void setEnseignant(Enseignant enseignant) {
		this.enseignant = enseignant;
	}

	public List<Note> getNote() {
		return note;
	}

	public void setNote(List<Note> note) {
		this.note = note;
	}

}