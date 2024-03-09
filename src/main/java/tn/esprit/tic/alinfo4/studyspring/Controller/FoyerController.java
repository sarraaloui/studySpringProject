package tn.esprit.tic.alinfo4.studyspring.Controller;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tic.alinfo4.studyspring.Entities.Foyer;
import tn.esprit.tic.alinfo4.studyspring.Entities.Universite;
import tn.esprit.tic.alinfo4.studyspring.Services.IFoyerService;

@RestController
@AllArgsConstructor
@RequestMapping("/foyer")
public class FoyerController {

IFoyerService iFoyerService;
/*
    @PutMapping("/affecterUniFoyer/{id_foyer}/{nom_universite}")
    public Universite getTypeChambre(@PathVariable("id_foyer") Long id_foyer, @PathVariable("nom_universite") String nom_universite) {
        return iFoyerService.affecterFoyerAUniversite(id_foyer,nom_universite);
    }*/


    @PostMapping("/addFoyerWithBloc")
    public Foyer addFoyerWithBloc(@RequestBody Foyer foyer) {
        return iFoyerService.addFoyerWithBloc(foyer);
}
}
