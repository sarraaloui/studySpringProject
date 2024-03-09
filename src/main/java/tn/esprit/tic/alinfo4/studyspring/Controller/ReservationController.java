package tn.esprit.tic.alinfo4.studyspring.Controller;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tic.alinfo4.studyspring.Entities.Reservation;
import tn.esprit.tic.alinfo4.studyspring.Entities.TypeChambre;
import tn.esprit.tic.alinfo4.studyspring.Services.IReservationService;

import java.time.LocalDate;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/reservation")
public class ReservationController {

    IReservationService iReservationService;
    @GetMapping("/findbyannee/")
    public List<Reservation> findbyannee(@RequestParam("date_debut") LocalDate date1, @RequestParam("date_fin") LocalDate date2) {
        return iReservationService.findByAnneeUniversitaireBetween(date1,date2);
    }
}
