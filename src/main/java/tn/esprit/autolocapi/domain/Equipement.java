package tn.esprit.autolocapi.domain;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.repository.cdi.Eager;

import java.util.List;

@Entity
@Table(name = "equipement")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor

public class Equipement {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int idEquipement;

    private String libelle ;
    @ManyToMany(mappedBy = "equipements")
    List<Vehicule> vehicules;

}
