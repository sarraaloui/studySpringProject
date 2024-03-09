package tn.esprit.tic.alinfo4.studyspring.Services;

import tn.esprit.tic.alinfo4.studyspring.Entities.Universite;

public interface IUniversiteService {


    Universite affecterFoyerAUniversite(Long idFoyer, String nomUniversite);
    public Universite desaffecterFoyerAUniversite (long idFoyer);

}
