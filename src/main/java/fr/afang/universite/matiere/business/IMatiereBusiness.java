package fr.afang.universite.matiere.business;

import java.util.List;

import fr.afang.universite.enseignant.domain.Enseignant;
import fr.afang.universite.matiere.domain.Matiere;

public interface IMatiereBusiness {

	List<Matiere> getListeMatiere();

	public Matiere getMatiereById(Integer id);

	public void saveMatiere(Matiere matiere);

	public void supprimeMatiere(Integer id);

	public void FindAllEnseignants();

	public List<Enseignant> getAllEnseignant();

	public Enseignant getEnseignantByID(Integer idEnseignant);

}
