package tn.esprit.tic.alinfo4.studyspring.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tic.alinfo4.studyspring.Entities.Bloc;
import tn.esprit.tic.alinfo4.studyspring.Entities.Universite;

public interface UniversiteRepository extends JpaRepository<Universite,Long> {

Universite findByNomUniversite(String nom_universite);
}
