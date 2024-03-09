package tn.esprit.tic.alinfo4.studyspring.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tic.alinfo4.studyspring.Entities.Reservation;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public interface ReservationRepository extends JpaRepository<Reservation , String > {

    List<Reservation>findByAnneeUniversitaireBetween(LocalDate datedebut,LocalDate datefin);



}
