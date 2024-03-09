package tn.esprit.tic.alinfo4.studyspring.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "Bloc")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Bloc implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idBloc")
    private Long idBloc; // Clé primaire
    private String nomBloc;
    private Long capaciteBloc;


    @ManyToOne
    @JsonIgnore
    private Foyer foyer;


    @OneToMany(cascade = CascadeType.ALL,mappedBy = "bloc")

    private Set<Chambre> chambres;


// Constructeur et accesseurs (getters) et mutateurs (setters)



}
