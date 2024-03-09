package tn.esprit.tic.alinfo4.studyspring.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tic.alinfo4.studyspring.Entities.Foyer;
import tn.esprit.tic.alinfo4.studyspring.Entities.Universite;
import tn.esprit.tic.alinfo4.studyspring.Repositories.FoyerRepository;
import tn.esprit.tic.alinfo4.studyspring.Repositories.UniversiteRepository;

@AllArgsConstructor
@Service
public class UniversiteServiceImpl implements  IUniversiteService {

    UniversiteRepository universiteRepository;
    FoyerRepository foyerRepository;


    @Override
    public Universite affecterFoyerAUniversite(Long idFoyer, String nomUniversite) {

        Foyer foyer = foyerRepository.findById(idFoyer).get();
        Universite universite = universiteRepository.findByNomUniversite(nomUniversite);
        foyer.setUniversite(universite);
        foyerRepository.save(foyer);
        return universite;
    }

    @Override
    public Universite desaffecterFoyerAUniversite(long idFoyer) {


        Foyer foyer = foyerRepository.findById(idFoyer).get();
        foyer.setUniversite(null);
        foyerRepository.save(foyer);
        return foyer.getUniversite();
    }


}
