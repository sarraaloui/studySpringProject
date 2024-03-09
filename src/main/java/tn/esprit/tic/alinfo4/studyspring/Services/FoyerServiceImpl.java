package tn.esprit.tic.alinfo4.studyspring.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tic.alinfo4.studyspring.Entities.Bloc;
import tn.esprit.tic.alinfo4.studyspring.Entities.Foyer;
import tn.esprit.tic.alinfo4.studyspring.Entities.Universite;
import tn.esprit.tic.alinfo4.studyspring.Repositories.BlocRepository;
import tn.esprit.tic.alinfo4.studyspring.Repositories.FoyerRepository;
import tn.esprit.tic.alinfo4.studyspring.Repositories.UniversiteRepository;

import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@Service
public class FoyerServiceImpl implements IFoyerService {

    FoyerRepository foyerRepository;

    UniversiteRepository universiteRepository;
BlocRepository blocRepository;

    @Override
    public Foyer addFoyerWithBloc(Foyer foyer) {
    Foyer foyer1=foyerRepository.save(foyer);
    foyer1.getBloc().forEach(bloc->{
    bloc.setFoyer(foyer);
    blocRepository.save(bloc);
    });
        return foyer1;
    }


/*
    @Override
    public Universite affecterFoyerAUniversite(Long idFoyer, String nomUniversite) {

        Foyer foyer=foyerRepository.findById(idFoyer).get();
        Universite universite=universiteRepository.findByNomUniversite(nomUniversite);
        foyer.setUniversite(universite);
        return universite;    }

        */
}
