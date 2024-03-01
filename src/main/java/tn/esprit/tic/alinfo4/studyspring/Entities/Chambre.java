package tn.esprit.tic.alinfo4.studyspring.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table( name = "Chambre")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Chambre implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idChambre")
    private Long idChambre; // Clé primaire
    private Long numeroChambre;

    @Enumerated(EnumType.ORDINAL)
    private TypeChambre typeC;


    @ManyToOne
    @JsonIgnore
    private Bloc bloc;


    @OneToMany(cascade = CascadeType.ALL)
    private Set<Reservation> reservation;


    // Constructeur et accesseurs (getters) et mutateurs (setters)
}
