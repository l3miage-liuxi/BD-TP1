package fr.uga.l3miage.tp1.exo1.models;


import fr.uga.l3miage.tp1.exo1.enums.CylinderNumber;
import fr.uga.l3miage.tp1.exo1.enums.ShifterType;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name="bike_porshe")
public class BikeEntity {
    @Id
    @Column(name = "immatriculation")
    public String immatriculation;

    @Column(name = "capacity")
    public Integer capacity;

    @Column(name = "automatic")
    public boolean automaatic;

    @Column(name = "shifter")
    public boolean shifter;

    @Column(name = "circulationDate")
    public LocalDate  circulationDate;

    @Column(name = "cylinderNumber")
    @Enumerated(EnumType.STRING)
    public CylinderNumber cylinderNumber;

    @Column(name = "shifterType")
    @Enumerated(EnumType.ORDINAL)
    public ShifterType shifterType;

}
