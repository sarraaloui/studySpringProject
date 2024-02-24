package tn.esprit.tic.alinfo4.studyspring.Controller;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.tic.alinfo4.studyspring.Services.IEtudiantService;

@RestController
@AllArgsConstructor
public class EtudiantController {

    private IEtudiantService etudiantService;
}
