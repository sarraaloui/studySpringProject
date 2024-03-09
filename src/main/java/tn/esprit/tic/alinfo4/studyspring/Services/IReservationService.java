package tn.esprit.tic.alinfo4.studyspring.Services;

import tn.esprit.tic.alinfo4.studyspring.Entities.Reservation;

import java.time.LocalDate;
import java.util.List;

public interface IReservationService {
    List<Reservation> findByAnneeUniversitaireBetween(LocalDate datedebut, LocalDate datefin);

}
