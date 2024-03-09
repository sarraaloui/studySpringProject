package tn.esprit.tic.alinfo4.studyspring.Controller;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tic.alinfo4.studyspring.Entities.*;
import tn.esprit.tic.alinfo4.studyspring.Services.IChambreService;
import tn.esprit.tic.alinfo4.studyspring.Services.IEtudiantService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/chambre")
public class ChambreController {


    IChambreService chambreService;

    @GetMapping("/retrieve-all-chambres")
    public List<Chambre> getChambres() {
        List<Chambre> listChambre = chambreService.retrieveAllChambres();
        return listChambre;

    }

    @GetMapping("/retrieve-etudiant/{chambre-id}")
    public Chambre retrieveChambre(@PathVariable("chambre-id") Long etudiantId) {
        return chambreService.retrieveChambre(etudiantId);
    }
    @PostMapping("/add-chambre")
    public Chambre addChambre(@RequestBody Chambre e) {
        Chambre chambre = chambreService.addChambre(e);
        return chambre;
    }

    @DeleteMapping("/remove-chambre/{chambre-id}")
    public void removeChambre(@PathVariable("chambre-id") Long chambreId) {
        chambreService.removeChambre(chambreId);
    }


    @PutMapping("/update-chambre")
    public Chambre updateChambre(@RequestBody Chambre e) {
        Chambre etudiant= chambreService.updateChambre(e);
        return etudiant;
    }


    @GetMapping("/retrieveType/{type}")
    public List<Chambre> getTypeChambre(@PathVariable("type") String typeChambre) {
        TypeChambre type = TypeChambre.valueOf(typeChambre.toUpperCase());
    return chambreService.findByTypeC(type);
    }



    @PutMapping("/affecterChambresABloc/{nom_Bloc}")
    public Bloc affecterChambresABloc(@PathVariable("nom_Bloc") String nom_Bloc, @RequestBody  List<Long> numeros) {
        return chambreService.affecterChambresABloc(numeros,nom_Bloc);
    }



    @GetMapping("/countbytype/{type}/{idbloc}")
    public Long countbytype(@PathVariable("type") TypeChambre typeChambre,@PathVariable("idbloc") Long idbloc) {
        return chambreService.nbChambreParTypeEtBloc(typeChambre,idbloc);
    }



}
