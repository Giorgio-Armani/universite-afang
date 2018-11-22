package fr.afang.universite.note.domain;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import fr.afang.universite.etudiants.domain.Etudiants;
import fr.afang.universite.matiere.domain.Matiere;

@Entity
@Table(name = "t_note")
public class Note {

	@EmbeddedId
	private NotePk notePk;

	@Column(name = "note")
	private Double note;

	@ManyToOne
	@JoinColumn(name = "id_etudiant", insertable = false, updatable = false)
	private Etudiants etudiant;

	@ManyToOne
	@JoinColumn(name = "id_matiere", insertable = false, updatable = false)
	private Matiere matiere;

	public NotePk getNotePk() {
		return notePk;
	}

	public void setNotePk(NotePk notePk) {
		this.notePk = notePk;
	}

	public Double getNote() {
		return note;
	}

	public void setNote(Double note) {
		this.note = note;
	}

	public Etudiants getEtudiant() {
		return etudiant;
	}

	public void setEtudiant(Etudiants etudiant) {
		this.etudiant = etudiant;
	}

	public Matiere getMatiere() {
		return matiere;
	}

	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
	}

}
