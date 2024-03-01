package tn.esprit.tic.alinfo4.studyspring.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tic.alinfo4.studyspring.Entities.Bloc;
import tn.esprit.tic.alinfo4.studyspring.Repositories.BlocRepository;

import java.util.List;


@AllArgsConstructor
@Service
public class BlocServiceImpl implements  IBlocService{

    BlocRepository blocRepository;

    @Override
    public List<Bloc> retrieveAllBlocs() {
        return  blocRepository.findAll();
    }

    @Override
    public Bloc addBloc(Bloc e) {
        return blocRepository.save(e);
    }

    @Override
    public Bloc updateBloc(Bloc e) {
        return blocRepository.save(e);

    }

    @Override
    public Bloc retrieveBloc(Long idBloc) {
        return blocRepository.findById(idBloc).orElse(null);
    }

    @Override
    public void removeBloc(Long idBloc) {
    blocRepository.deleteById(idBloc);
    }

    @Override
    public List<Bloc> addBlocs(List<Bloc> blocs) {
        return blocRepository.saveAll(blocs);
    }
}
