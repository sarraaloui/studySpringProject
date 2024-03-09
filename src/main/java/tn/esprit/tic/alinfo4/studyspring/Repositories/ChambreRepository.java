package tn.esprit.tic.alinfo4.studyspring.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.tic.alinfo4.studyspring.Entities.*;

import java.util.List;

@EnableJpaRepositories
public interface ChambreRepository extends JpaRepository<Chambre,Long> {

     List<Chambre>findByTypeC(TypeChambre id);
Chambre findByNumeroChambre(Long num);
     List<Chambre>findByTypeCAndBloc_IdBloc(TypeChambre typeChambre,Long idbloc);

     List<Chambre>findByBloc_NomBloc(String nom);



     @Query("SELECT count(c) FROM Chambre c,Bloc b WHERE b.idBloc=c.bloc.idBloc and b.idBloc=:id and c.typeC=:typeChambre " )
             Long nbrChambreByTypeCAAndBloc_IdBloc(@Param("id") Long id, @Param("typeChambre") TypeChambre typeChambre);

}
