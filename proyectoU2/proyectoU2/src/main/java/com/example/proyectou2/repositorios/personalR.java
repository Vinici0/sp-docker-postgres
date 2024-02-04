package com.example.proyectou2.repositorios;

import com.example.proyectou2.modelos.usuarios;
import org.springframework.data.jpa.repository.JpaRepository;

public interface personalR extends JpaRepository<usuarios,Long> {
}
