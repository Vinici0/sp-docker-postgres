package com.example.proyectou2.modelos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "rol")
public class rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_rol;
    private String nombreRol;
    private String descripcion;
    private String fechaCreacion;
    private boolean estado;
    private String tipo;


    public boolean getEstado() {
        return this.estado;
    }

}

