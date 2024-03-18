package fr.uga.l3miage.tp1.exo3.models;

import fr.uga.l3miage.tp1.exo3.enums.BrandType;

import javax.persistence.*;
import java.util.List;

@Entity
public class Brand_miage {
    @Id
    public String company_name;
    @Column(length = 11)
    public String sireNumber;
    @Enumerated(EnumType.STRING)
    public BrandType type;

    @OneToMany(mappedBy = "brandMiage")
    private List<Product_entity> products;

}
