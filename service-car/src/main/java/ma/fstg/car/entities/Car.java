package ma.fstg.car.entities;

import jakarta.persistence.*;
import lombok.*;
import ma.fstg.car.models.Client;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String marque;
    private String modele;
    private String matricule;
    private Long clientId;

    @Transient
    private Client client;
}
