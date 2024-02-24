package tn.esprit.tic.alinfo4.studyspring.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tic.alinfo4.studyspring.Entities.Chambre;

@Repository
public interface ChambreRepository extends JpaRepository<Chambre,Long> {
}
