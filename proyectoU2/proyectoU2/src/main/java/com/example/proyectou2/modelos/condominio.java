package com.example.proyectou2.modelos;

import jakarta.persistence.*;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "condominios")

public class condominio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_condominio;


    private String nombre;

     private String direccion;

     private String ciudad;

     private double precio;



}
