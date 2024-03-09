package tn.esprit.tic.alinfo4.studyspring.Services;

import lombok.AllArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;
import tn.esprit.tic.alinfo4.studyspring.Entities.Bloc;
import tn.esprit.tic.alinfo4.studyspring.Entities.Chambre;
import tn.esprit.tic.alinfo4.studyspring.Entities.Reservation;
import tn.esprit.tic.alinfo4.studyspring.Entities.TypeChambre;
import tn.esprit.tic.alinfo4.studyspring.Repositories.BlocRepository;
import tn.esprit.tic.alinfo4.studyspring.Repositories.ChambreRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@Service

public class ChambreServiceImpl implements IChambreService{

ChambreRepository chambreRepository;
    BlocRepository blocRepository;

    @Override
    public List<Chambre> retrieveAllChambres() {
        return chambreRepository.findAll();
    }

    @Override
    public Chambre addChambre(Chambre e) {
        return chambreRepository.save(e);
    }

    @Override
    public Chambre updateChambre(Chambre e) {
        return chambreRepository.save(e);
    }

    @Override
    public Chambre retrieveChambre(Long idChambre) {
        return chambreRepository.findById(idChambre).orElse(null);
    }

    @Override
    public void removeChambre(Long idChambre) {
        chambreRepository.deleteById(idChambre);
    }

    @Override
    public List<Chambre> addChambres(List<Chambre> chambres) {
        return chambreRepository.saveAll(chambres);
    }

    @Override
    public List<Chambre> findByTypeC(TypeChambre id) {
        return chambreRepository.findByTypeC(id);
    }

    @Override
    public Bloc affecterChambresABloc(List<Long> numChambre, String nomBloc) {

        Bloc bloc=blocRepository.findByNomBloc(nomBloc);

        bloc.getChambres().forEach(chambre ->{
        Chambre chambre1=chambreRepository.findByNumeroChambre(chambre.getNumeroChambre());
        chambre1.setBloc(bloc);
        chambreRepository.save(chambre1);
        }

        );

        return bloc;
    }

    @Override
    public long nbChambreParTypeEtBloc(TypeChambre type, Long idBloc) {

        return chambreRepository.nbrChambreByTypeCAAndBloc_IdBloc(idBloc,type);
    }


}
