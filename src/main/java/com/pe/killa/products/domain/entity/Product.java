package com.pe.killa.products.domain.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "product")
@Data
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    private Double price;

    @Column(name = "create_at")
    @Temporal(TemporalType.DATE)
    private Date createAt;


}
