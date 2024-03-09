package tn.esprit.tic.alinfo4.studyspring.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tic.alinfo4.studyspring.Entities.Bloc;
import tn.esprit.tic.alinfo4.studyspring.Entities.Chambre;

import java.util.List;
import java.util.Set;

@Repository
public interface BlocRepository extends JpaRepository<Bloc,Long> {



Bloc findByNomBloc(String nom_bloc);
List<Chambre>findAllByNomBloc(String nombloc);
}
