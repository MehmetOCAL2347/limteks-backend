package com.demo.ecommerce.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "image")
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "mainImageUrl")
    private String mainImageUrl;

    @OneToMany(mappedBy = "image")
    private List<SubImage> subImages;

    @OneToOne(mappedBy = "image")
    private Product product;

}
