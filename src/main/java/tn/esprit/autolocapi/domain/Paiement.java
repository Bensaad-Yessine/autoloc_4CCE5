package tn.esprit.autolocapi.domain;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "paiement")
public class Paiement {
    public Long getId() {
        return idPaiement;
    }

    public void setId(Long id) {
        this.idPaiement = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPaiement;
    @Column(nullable = false,precision=10, scale=2)
    private  BigDecimal montant;
    private LocalDate datePaiement;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false,length = 20)
    private ModePaiement modePaiement;

}
