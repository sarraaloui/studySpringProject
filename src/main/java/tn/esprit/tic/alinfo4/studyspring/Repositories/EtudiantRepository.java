package tn.esprit.tic.alinfo4.studyspring.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tic.alinfo4.studyspring.Entities.Etudiant;

import java.time.Month;
import java.util.List;

public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {


    List<Etudiant>findAllByNomEtStartsWith(char s);
    List<Etudiant>findAllByEcole(String  ecole);
}
