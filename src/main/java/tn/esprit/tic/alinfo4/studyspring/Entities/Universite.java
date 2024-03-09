package tn.esprit.tic.alinfo4.studyspring.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
@Entity
@Table(name = "Universite")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Universite implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUniversite")
    private Long idUniversite; // Clé primaire
    private String nomUniversite;
    private String adresse;


    @OneToOne(mappedBy = "universite",cascade = CascadeType.ALL)
    @JsonIgnore
    private Foyer foyer;


// Constructeur et accesseurs (getters) et mutateurs (setters)

}
