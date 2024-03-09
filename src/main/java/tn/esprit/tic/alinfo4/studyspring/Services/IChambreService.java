package tn.esprit.tic.alinfo4.studyspring.Services;

import tn.esprit.tic.alinfo4.studyspring.Entities.Bloc;
import tn.esprit.tic.alinfo4.studyspring.Entities.Chambre;
import tn.esprit.tic.alinfo4.studyspring.Entities.Reservation;
import tn.esprit.tic.alinfo4.studyspring.Entities.TypeChambre;

import java.util.List;
import java.util.Set;

public interface IChambreService {



    List<Chambre> retrieveAllChambres();
    Chambre addChambre(Chambre e);
    Chambre updateChambre(Chambre e);
    Chambre retrieveChambre(Long idBloc);
    void removeChambre(Long idBloc);
    List<Chambre> addChambres (List<Chambre> chambres);
    List<Chambre>findByTypeC(TypeChambre id);

    public Bloc affecterChambresABloc (List<Long> numChambre, String nomBloc) ;

    public long nbChambreParTypeEtBloc ( TypeChambre type, Long idBloc );



}
