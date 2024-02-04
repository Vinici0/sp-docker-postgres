package com.example.proyectou2.modelos;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "bloque")
public class bloque {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_bloque;

     private String nombre;


    private int numeroPisos;

}

