package fr.uga.l3miage.tp1.exo3.models;

import fr.uga.l3miage.tp1.exo3.enums.AssociationType;

import javax.persistence.*;
import javax.persistence.Id;

@Entity
public class AssociationEntity {
    @Id
    public String name;

    @Column(name = "presidentName", nullable = false)
    private String presidentName;
    @Column(name = "treasurer_name", nullable = false)

    private String treasurerName;
    private String secretaryName;

    @Enumerated(EnumType.STRING)
    private AssociationType associationType;

    @ManyToOne
    @JoinColumn(name = "federation_id")
    private FederationEntity federation;


}
