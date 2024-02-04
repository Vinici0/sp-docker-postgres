package com.example.monglo.modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Data
@Document(collection = "apartamentos")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Apartamento {

    @Id
    private String id_apartamento;

    private String numero_bano;
    private int numeroHabitaciones;
    private double metros_cudrados;

    private byte[] imagen;

    private String estado;

    private Condominio condominio;
    private Bloque bloque;

}