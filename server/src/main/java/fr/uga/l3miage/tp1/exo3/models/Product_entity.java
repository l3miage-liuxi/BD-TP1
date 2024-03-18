package fr.uga.l3miage.tp1.exo3.models;

import javax.persistence.*;

@Entity
public class Product_entity {
    @Id
    @Column(length = 15)
    public String bar_code_number;

    public String name;

    public  boolean consumable;

    @ManyToOne
    @JoinColumn(name = "brand_company_name")
    public Brand_miage brand_miage;

}
