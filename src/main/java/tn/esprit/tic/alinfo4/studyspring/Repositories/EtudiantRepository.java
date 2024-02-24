package tn.esprit.tic.alinfo4.studyspring.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tic.alinfo4.studyspring.Entities.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
}
