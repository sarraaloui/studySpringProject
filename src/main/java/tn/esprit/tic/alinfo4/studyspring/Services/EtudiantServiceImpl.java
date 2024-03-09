package tn.esprit.tic.alinfo4.studyspring.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tic.alinfo4.studyspring.Entities.Etudiant;
import tn.esprit.tic.alinfo4.studyspring.Entities.Reservation;
import tn.esprit.tic.alinfo4.studyspring.Repositories.EtudiantRepository;
import tn.esprit.tic.alinfo4.studyspring.Repositories.ReservationRepository;

import java.time.Month;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@Service
public class EtudiantServiceImpl implements IEtudiantService {


    EtudiantRepository etudiantRepository ;

ReservationRepository reservationRepository;
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

    @Override
    public List<Etudiant> findAllByNomEtStartsWith(char s) {
        return etudiantRepository.findAllByNomEtStartsWith(s);
    }

    @Override
public List<Etudiant>findAllByEcole(String  ecole){
        return etudiantRepository.findAllByEcole(ecole);
    }

    @Override
    public Etudiant affecterEtudiantAReservation(String nomEt, String prenomEt, String idReservation) {

        Reservation reservation= reservationRepository.findById(idReservation).get();
        Etudiant etudiant=etudiantRepository.findByNomEtAndPrenomEt(nomEt,prenomEt);

        Set<Etudiant> etudiants=new HashSet<>();

        if(etudiant.getReservations()!=null){
            etudiants.addAll(reservation.getEtudiant());
        }
        etudiants.add(etudiant);
        reservation.setEtudiant(etudiants);
        reservationRepository.save(reservation);
        return etudiant;
    }


}
