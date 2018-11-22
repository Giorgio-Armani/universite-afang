package fr.afang.universite.etudiants.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.afang.universite.etudiants.domain.Etudiants;

@Repository
public interface IEtudiantsRepository extends JpaRepository<Etudiants, Integer>{

}
