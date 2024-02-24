package tn.esprit.tic.alinfo4.studyspring.Services;

import lombok.AllArgsConstructor;
import tn.esprit.tic.alinfo4.studyspring.Entities.Etudiant;
import tn.esprit.tic.alinfo4.studyspring.Repositories.EtudiantRepository;

import java.util.List;

@AllArgsConstructor
public class EtudiantServiceImpl implements IEtudiantService {


    EtudiantRepository etudiantRepository ;


    @Override
    public List<Etudiant> retrieveAllEtudiants() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant addEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {

        return etudiantRepository.save(e);
    }

    @Override
    public Etudiant retrieveEtudiant(Long idEtudiant) {
        return etudiantRepository.findById(idEtudiant).orElse(null);
    }

    @Override
    public void removeEtudiant(Long idEtudiant) {
    etudiantRepository.deleteById(idEtudiant);
    }

    @Override
    public List<Etudiant> addEtudiants(List<Etudiant> etudiants) {
        return etudiantRepository.saveAll(etudiants);
    }



}
