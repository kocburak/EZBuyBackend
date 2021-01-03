package com.ezbuy.backend.Entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;
import java.util.UUID;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "categories")
public class Category implements Serializable {

    @Id
    @Column(columnDefinition = "BINARY(16)")
    private UUID id;

    private String name;

    @OneToMany(mappedBy = "category", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Set<Product> products;

    public Category(UUID id, String name) {
        this.id = id;
        this.name = name;
    }


}
