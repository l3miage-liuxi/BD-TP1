package fr.uga.l3miage.tp1.exo3.models;

import fr.uga.l3miage.tp1.exo3.enums.AssociationType;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class FederationEntity {
    @Id
    public String name;

    public boolean isFageMembership;

    @OneToMany(mappedBy = "federation")
    public List<AssociationEntity> associationEntities;
}
