package fr.afang.universite.enseignant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.afang.universite.enseignant.domain.Enseignant;

@Repository
public interface IEnseignantRepository extends JpaRepository<Enseignant, Integer> {

}
