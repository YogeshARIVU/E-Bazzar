package com.bazzar.bazzar.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String name;

        private String description;

        private String imageUrl;

        @Column(precision = 10, scale = 2)
        private BigDecimal price;

        @ManyToOne
        @JoinColumn(name = "category_id", nullable = false)
        @JsonBackReference
        private Category category;


    }


