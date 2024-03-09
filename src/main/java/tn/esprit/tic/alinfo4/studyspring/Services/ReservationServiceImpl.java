package tn.esprit.tic.alinfo4.studyspring.Services;

import tn.esprit.tic.alinfo4.studyspring.Entities.Reservation;
import tn.esprit.tic.alinfo4.studyspring.Repositories.ReservationRepository;

import java.time.LocalDate;
import java.util.List;

public class ReservationServiceImpl implements IReservationService{

   ReservationRepository reservationRepository;
    @Override
    public List<Reservation> findByAnneeUniversitaireBetween(LocalDate datedebut, LocalDate datefin) {
        return reservationRepository.findByAnneeUniversitaireBetween(datedebut,datefin);
    }
}
