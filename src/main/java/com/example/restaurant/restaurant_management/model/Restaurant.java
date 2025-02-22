package com.example.restaurant.restaurant_management.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.*; // ✅ Правильный импорт
import lombok.*;

import java.util.List;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String address;

    @OneToMany(mappedBy = "restaurant", cascade = CascadeType.ALL, orphanRemoval = true)
//    @JsonManagedReference
    private List<MenuItem> menuItems;
}
