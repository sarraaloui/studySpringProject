package tn.esprit.tic.alinfo4.studyspring.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;


@Entity
@Table( name = "Reservation")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Reservation implements Serializable {

    @Id
    @Column(name = "idReservation")
    private String idReservation ;

    private Date anneeUniversitaire; // Clé primaire
    private boolean estValide ;


    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Etudiant> etudiant;


// Constructeur et accesseurs (getters) et mutateurs (setters)
}
