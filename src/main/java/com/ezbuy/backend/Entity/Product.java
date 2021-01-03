package com.ezbuy.backend.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;


@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "products")
public class Product implements Serializable {

    @Id
    @Column(columnDefinition = "BINARY(16)")
    private UUID id;

    private String name;
    private String imageUrl;

    private String description;

    @Column(columnDefinition="Decimal(10,2) default '100.00'")
    private double price;


    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;


}
