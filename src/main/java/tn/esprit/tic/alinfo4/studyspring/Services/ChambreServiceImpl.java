package tn.esprit.tic.alinfo4.studyspring.Services;

import lombok.AllArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;
import tn.esprit.tic.alinfo4.studyspring.Entities.Bloc;
import tn.esprit.tic.alinfo4.studyspring.Entities.Chambre;
import tn.esprit.tic.alinfo4.studyspring.Entities.Reservation;
import tn.esprit.tic.alinfo4.studyspring.Entities.TypeChambre;
import tn.esprit.tic.alinfo4.studyspring.Repositories.ChambreRepository;

import java.util.List;

@AllArgsConstructor
@Service

public class ChambreServiceImpl implements IChambreService{

ChambreRepository chambreRepository;

    @Override
    public List<Chambre> retrieveAllChambres() {
        return chambreRepository.findAll();
    }

    @Override
    public Chambre addChambre(Chambre e) {
        return chambreRepository.save(e);
    }

    @Override
    public Chambre updateChambre(Chambre e) {
        return chambreRepository.save(e);
    }

    @Override
    public Chambre retrieveChambre(Long idChambre) {
        return chambreRepository.findById(idChambre).orElse(null);
    }

    @Override
    public void removeChambre(Long idChambre) {
        chambreRepository.deleteById(idChambre);
    }

    @Override
    public List<Chambre> addChambres(List<Chambre> chambres) {
        return chambreRepository.saveAll(chambres);
    }

    @Override
    public List<Chambre> findByTypeC(TypeChambre id) {
        return chambreRepository.findByTypeC(id);
    }


}
