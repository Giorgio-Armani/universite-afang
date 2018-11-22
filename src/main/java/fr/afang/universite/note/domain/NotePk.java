package fr.afang.universite.note.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class NotePk implements Serializable {

	@Column(name = "ID_ETUDIANT")
	private Integer idEtudiant;

	@Column(name = "ID_MATIERE")
	private Integer idmatiere;

	public Integer getIdEtudiant() {
		return idEtudiant;
	}

	public void setIdEtudiant(Integer idEtudiant) {
		this.idEtudiant = idEtudiant;
	}

	public Integer getIdmatiere() {
		return idmatiere;
	}

	public void setIdmatiere(Integer idmatiere) {
		this.idmatiere = idmatiere;
	}

}
