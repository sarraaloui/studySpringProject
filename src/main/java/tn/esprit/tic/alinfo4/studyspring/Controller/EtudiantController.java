package tn.esprit.tic.alinfo4.studyspring.Controller;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tic.alinfo4.studyspring.Entities.Etudiant;
import tn.esprit.tic.alinfo4.studyspring.Services.IEtudiantService;

import java.time.Month;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/etudiant")

public class EtudiantController {

    IEtudiantService etudiantService;
    @GetMapping("/retrieve-all-etudiants")
    public List<Etudiant> getEtudiants() {
        List<Etudiant> listEtudiants = etudiantService.retrieveAllEtudiants();
        return listEtudiants;

    }

    @GetMapping("/retrieve-etudiant/{etudiant-id}")
    public Etudiant retrieveEtudiant(@PathVariable("etudiant-id") Long etudiantId) {
        return etudiantService.retrieveEtudiant(etudiantId);
    }
    @PostMapping("/add-etudiant")
    public Etudiant addEtudiant(@RequestBody Etudiant e) {
        Etudiant etudiant = etudiantService.addEtudiant(e);
        return etudiant;
    }

    @DeleteMapping("/remove-etudiant/{etudiant-id}")
    public void removeEtudiant(@PathVariable("etudiant-id") Long etudiantId) {
        etudiantService.removeEtudiant(etudiantId);
    }
    @PutMapping("/update-etudiant")
    public Etudiant updateEtudiant(@RequestBody Etudiant e) {
        Etudiant etudiant= etudiantService.updateEtudiant(e);
        return etudiant;
    }


    @GetMapping("/retrieveListetudiant/{caractere}")
    public List<Etudiant> retrieveListetudiant(@PathVariable("caractere") char caractere) {
        return etudiantService.findAllByNomEtStartsWith(caractere);
    }


    @GetMapping("/retrieveListeEcole/{ecole}")
    public List<Etudiant> retrieveListeEcole(@PathVariable("ecole") String  ecole) {
        return etudiantService.findAllByEcole(ecole);
    }




    @PutMapping("/affecterEtudiantAReservation/{nom}/{prenom}/{id}")
    public Etudiant affecterEtudiantAReservation(@PathVariable("nom") String  nom,@PathVariable("prenom") String  prenom, @PathVariable("id") String  id) {
      return etudiantService.affecterEtudiantAReservation(nom,prenom,id);
    }


}

