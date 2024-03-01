package tn.esprit.tic.alinfo4.studyspring.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tic.alinfo4.studyspring.Entities.*;

import java.util.List;

@Repository
public interface ChambreRepository extends JpaRepository<Chambre,Long> {


     List<Chambre>findByTypeC(TypeChambre id);


}
