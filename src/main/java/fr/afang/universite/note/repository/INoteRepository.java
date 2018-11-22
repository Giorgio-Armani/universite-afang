package fr.afang.universite.note.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.afang.universite.note.domain.Note;
import fr.afang.universite.note.domain.NotePk;

public interface INoteRepository extends JpaRepository<Note, NotePk> {

}
