package tn.esprit.tic.alinfo4.studyspring.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tic.alinfo4.studyspring.Entities.Chambre;
import tn.esprit.tic.alinfo4.studyspring.Entities.TypeChambre;
import tn.esprit.tic.alinfo4.studyspring.Entities.Universite;
import tn.esprit.tic.alinfo4.studyspring.Services.IUniversiteService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/universite")
public class UniversiteController {

    IUniversiteService iUniversiteService;

    @PutMapping("/affecterUniFoyer/{id_foyer}/{nom_universite}")
    public Universite affecterUniFoyer(@PathVariable("id_foyer") Long id_foyer, @PathVariable("nom_universite") String nom_universite) {
        return iUniversiteService.affecterFoyerAUniversite(id_foyer,nom_universite);
    }

    @PutMapping("/desaffecterUniFoyer/{id_foyer}")
    public Universite desaffecterUniFoyer (@PathVariable("id_foyer") Long id_foyer) {
        return iUniversiteService.desaffecterFoyerAUniversite(id_foyer);
    }

}
