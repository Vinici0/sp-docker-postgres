package com.example.monglo.modelo;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "bloques")
public class Bloque {

    @Id
    @JsonProperty("id_bloque")
    private String id;

    private String nombre;
    private int numeroPisos;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroPisos() {
        return numeroPisos;
    }

    public void setNumeroPisos(int numeroPisos) {
        this.numeroPisos = numeroPisos;
    }

    @Override
    public String toString() {
        return "Bloque{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", numeroPisos=" + numeroPisos +
                '}';
    }
}
