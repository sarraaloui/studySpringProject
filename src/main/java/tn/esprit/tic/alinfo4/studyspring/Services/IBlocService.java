package tn.esprit.tic.alinfo4.studyspring.Services;

import tn.esprit.tic.alinfo4.studyspring.Entities.Bloc;
import tn.esprit.tic.alinfo4.studyspring.Entities.Etudiant;

import java.util.List;

public interface IBlocService {



    List<Bloc> retrieveAllBlocs();
    Bloc addBloc(Bloc e);
    Bloc updateBloc(Bloc e);
    Bloc retrieveBloc(Long idBloc);
    void removeBloc(Long idBloc);
    List<Bloc> addBlocs (List<Bloc> blocs);

}
