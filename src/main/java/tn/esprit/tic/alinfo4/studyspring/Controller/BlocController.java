package tn.esprit.tic.alinfo4.studyspring.Controller;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tic.alinfo4.studyspring.Entities.Bloc;
import tn.esprit.tic.alinfo4.studyspring.Entities.Chambre;
import tn.esprit.tic.alinfo4.studyspring.Entities.Etudiant;
import tn.esprit.tic.alinfo4.studyspring.Services.BlocServiceImpl;
import tn.esprit.tic.alinfo4.studyspring.Services.IBlocService;
import tn.esprit.tic.alinfo4.studyspring.Services.IEtudiantService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/bloc")
public class BlocController {

    IBlocService blocService;

    @GetMapping("/retrieve-all-blocs")
    public List<Bloc> getBlocs() {
        List<Bloc> listBlocs = blocService.retrieveAllBlocs();
        return listBlocs;

    }

    @GetMapping("/retrieve-bloc/{bloc-id}")
    public Bloc retrieveBloc(@PathVariable("bloc-id") Long blocId) {
        return blocService.retrieveBloc(blocId);
    }
    @PostMapping("/add-bloc")
    public Bloc addBloc(@RequestBody Bloc e) {
        Bloc bloc = blocService.addBloc(e);
        return bloc;
    }

    @DeleteMapping("/remove-bloc/{bloc-id}")
    public void removeEtudiant(@PathVariable("bloc-id") Long blocId) {
        blocService.removeBloc(blocId);
    }
    @PutMapping("/update-bloc")
    public Bloc updateEtudiant(@RequestBody Bloc e) {
        Bloc bloc= blocService.updateBloc(e);
        return bloc;
    }


    @GetMapping("/retrieveChambre/{nombloc}")
    public List<Chambre> retrieveChambre(@PathVariable("nombloc") String  nombloc) {
        return blocService.findAllByNomBloc(nombloc);
    }


}
